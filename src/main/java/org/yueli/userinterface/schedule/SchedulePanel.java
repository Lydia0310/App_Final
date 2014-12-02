package org.yueli.userinterface.schedule;

import org.yueli.business.schedule.Schedule;
import org.yueli.userinterface.frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 * Created by Lydia on 11/30/2014/2014.
 */
public class SchedulePanel extends JPanel {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final long millisPerDay = 24 * 60 * 60 * 1000;
    private JPanel panel;
    private int panelWidth = 500;
    private int panelHeight = 400;
    private int rowHeight = 30;
    private int firstColumnWidth = 50;
    private Dimension panelSize = new Dimension(panelWidth, panelHeight);
    private Dimension rowPanelSize = new Dimension(panelWidth, rowHeight);
    private Map<String, ScheduleUnit> slicedSchedule;

    private class ScheduleUnit {
        private List<Pair> daySchedule;

        public class Pair {
            private long beginTime;
            private long endTime;

            public Pair(long beginTime, long endTime) {
                this.beginTime = beginTime;
                this.endTime = endTime;
            }

            public long getBeginTime() {
                return beginTime;
            }

            public void setBeginTime(long beginTime) {
                this.beginTime = beginTime;
            }

            public long getEndTime() {
                return endTime;
            }

            public void setEndTime(long endTime) {
                this.endTime = endTime;
            }
        }

        public ScheduleUnit() {
            daySchedule = new LinkedList<>();
        }

        public void addSchedule (long beginTime, long endTime) {
            daySchedule.add(new Pair(beginTime, endTime));
        }

        public List<Pair> getDaySchedule () {
            return daySchedule;
        }
    }

    private class RowPanel extends JPanel {
        private List<ScheduleUnit.Pair> scheduleList;
        public RowPanel(List<ScheduleUnit.Pair> scheduleList) {
            this.scheduleList = scheduleList;
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setMaximumSize(rowPanelSize);
            setMinimumSize(rowPanelSize);
            setPreferredSize(rowPanelSize);
        }

        public RowPanel() {
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setMaximumSize(rowPanelSize);
            setMinimumSize(rowPanelSize);
            setPreferredSize(rowPanelSize);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D paint = (Graphics2D) g;
            paint.setStroke(new BasicStroke(3));
            paint.setColor(MainFrame.blue);
            for (ScheduleUnit.Pair pair : scheduleList) {
                double startX = (panelWidth / millisPerDay ) * (pair.getBeginTime() % millisPerDay) + firstColumnWidth;
                double endX = (panelWidth / millisPerDay ) * (pair.getEndTime() % millisPerDay) + firstColumnWidth;
                Shape line = new Line2D.Double(startX, 10, endX, 10);
                paint.draw(line);
            }
        }
    }

    public SchedulePanel(List<Schedule> scheduleList) {
        slicedSchedule = new HashMap<>();
        sliceScheduleList(scheduleList);
        // sort collection
        Collections.sort(scheduleList);
        setLayout(new BorderLayout());
        panel = new JPanel(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);
        this.add(scrollPane, BorderLayout.CENTER);
        setMaximumSize(panelSize);
        setMinimumSize(panelSize);
        setPreferredSize(panelSize);
        refreshSchedule(scheduleList);
    }

    private void refreshSchedule (List<Schedule> scheduleList) {
        panel.removeAll();
        // first row
        JPanel head = new JPanel(new BorderLayout());
        head.setMaximumSize(rowPanelSize);
        head.setMinimumSize(rowPanelSize);
        head.add(Box.createHorizontalStrut(firstColumnWidth), BorderLayout.WEST);
        head.add(new JLabel("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24"), BorderLayout.CENTER);
        panel.add(head);
        Calendar current = Calendar.getInstance();
        current.setTime(scheduleList.get(0).getBeginTime());
        Calendar nextDay = Calendar.getInstance();
        nextDay.setTime(current.getTime());
        nextDay.add(Calendar.DAY_OF_YEAR, 1);
        Calendar lastDay = Calendar.getInstance();
        lastDay.setTime(scheduleList.get(scheduleList.size() - 1).getEndTime());
        while (nextDay.compareTo(lastDay) < 0) {
            String currentDate = dateFormat.format(current.getTime());
            ScheduleUnit scheduleUnit = slicedSchedule.get(currentDate);
            RowPanel rowPanel;
            if (scheduleUnit != null) {
                rowPanel = new RowPanel(scheduleUnit.daySchedule);
            } else {
                rowPanel = new RowPanel();
            }
            rowPanel.add(new JLabel(currentDate));
            panel.add(rowPanel);
            current.add(Calendar.DAY_OF_YEAR, 1);
            nextDay.add(Calendar.DAY_OF_YEAR, 1);
        }
    }

    private void sliceScheduleList (List<Schedule> scheduleList) {
        for (Schedule schedule : scheduleList) {
            long begin = schedule.getEndTime().getTime();
            long end = schedule.getBeginTime().getTime();
            if (end - begin > millisPerDay) {
                // cross one day
                while (begin + millisPerDay < end) {
                    String currentDay = dateFormat.format(new Date(begin));
                    ScheduleUnit day = slicedSchedule.get(currentDay);
                    if (day == null)
                        day = new ScheduleUnit();
                    try {
                        long nextDay00 = dateFormat.parse(dateFormat.format(new Date(begin + millisPerDay)) + " 00:00").getTime();
                        day.addSchedule(begin, nextDay00);
                        slicedSchedule.put(dateFormat.format(new Date(begin)), day);
                        begin = nextDay00;
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                String currentDay = dateFormat.format(new Date(begin));
                ScheduleUnit day = slicedSchedule.get(currentDay);
                if (day == null)
                    day = new ScheduleUnit();
                day.addSchedule(begin, end);
                slicedSchedule.put(dateFormat.format(new Date(begin)), day);
            } else {
                // schedule less than one day
                String currentDay = dateFormat.format(new Date(begin));
                ScheduleUnit day = slicedSchedule.get(currentDay);
                if (day == null)
                    day = new ScheduleUnit();
                day.addSchedule(begin, end);
                slicedSchedule.put(dateFormat.format(new Date(begin)), day);
            }
        }
    }

}
