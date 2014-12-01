package org.yueli.userinterface.schedule;

import org.yueli.business.schedule.Schedule;
import org.yueli.userinterface.frame.MainFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Line2D;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 * Created by Yue Li on 11/30/2014/2014.
 */
public class SchedulePanel extends JPanel {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    private final long millisPerDay = 24 * 60 * 60 * 1000;
    private final long secondsPerDay = 24 * 60 * 60;
    private JPanel panel;
    private int panelWidth = 680;
    private int panelHeight = 400;
    private int rowHeight = 30;
    private int firstColumnWidth = 120;
    private Dimension panelSize = new Dimension(panelWidth, panelHeight);
    private Dimension rowPanelSize = new Dimension(panelWidth - 8, rowHeight);
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
            paint.setStroke(new BasicStroke(10));
            paint.setColor(MainFrame.blue);
            for (ScheduleUnit.Pair pair : scheduleList) {
                String[] splitTime = timeFormat.format(new Date(pair.beginTime)).split(":");
                int beginInSeconds = Integer.valueOf(splitTime[0]) * 60 * 60 + Integer.valueOf(splitTime[1]) * 60 + Integer.valueOf(splitTime[2]);
                splitTime = timeFormat.format(new Date(pair.endTime)).split(":");
                int endInSeconds = Integer.valueOf(splitTime[0]) * 60 * 60 + Integer.valueOf(splitTime[1]) * 60 + Integer.valueOf(splitTime[2]);
                double startX = ((double)(panelWidth - firstColumnWidth) / secondsPerDay) * beginInSeconds + firstColumnWidth;
                double endX = ((double)(panelWidth - firstColumnWidth) / secondsPerDay) * endInSeconds + firstColumnWidth;
                Shape line = new Line2D.Double(startX, 10, endX, 10);
                paint.draw(line);
            }
        }
    }

    public SchedulePanel(List<Schedule> scheduleList) {
        slicedSchedule = new HashMap<>();
        sliceScheduleList(scheduleList);
        setBorder(BorderFactory.createLineBorder(MainFrame.blue, 2));
        // sort collection
        Collections.sort(scheduleList);
        setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
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
        head.add(new JLabel("00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24"), BorderLayout.CENTER);
        panel.add(head);
        long currentTime = scheduleList.get(0).getBeginTime().getTime();
        long endTime = 0;
        for (Schedule schedule : scheduleList) {
            // get the largest end time
            if (schedule.getEndTime().getTime() > endTime)
                endTime = schedule.getEndTime().getTime();
        }
        while (currentTime < endTime) {
            String currentDate = dateFormat.format(new Date(currentTime));
            ScheduleUnit scheduleUnit = slicedSchedule.get(currentDate);
            RowPanel rowPanel;
            if (scheduleUnit != null) {
                rowPanel = new RowPanel(scheduleUnit.daySchedule);
            } else {
                rowPanel = new RowPanel();
            }
            rowPanel.add(new JLabel(currentDate));
            panel.add(rowPanel);
            currentTime += millisPerDay;
        }
    }

    private void sliceScheduleList (List<Schedule> scheduleList) {
        for (Schedule schedule : scheduleList) {
            long begin = schedule.getBeginTime().getTime();
            long end = schedule.getEndTime().getTime();
            if (end - begin > millisPerDay) {
                // cross one day
                while (end - millisPerDay > begin) {
                    String currentDay = dateFormat.format(new Date(begin));
                    ScheduleUnit day = slicedSchedule.get(currentDay);
                    if (day == null)
                        day = new ScheduleUnit();
                    try {
                        long today24 = dateFormat.parse(dateFormat.format(new Date(begin)) + " 24:00").getTime();
                        long nextDay00 = dateFormat.parse(dateFormat.format(new Date(begin + millisPerDay)) + " 00:00").getTime();
                        day.addSchedule(begin, today24);
                        slicedSchedule.put(currentDay, day);
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
                slicedSchedule.put(currentDay, day);
            } else {
                // schedule less than one day
                String currentDay = dateFormat.format(new Date(begin));
                ScheduleUnit day = slicedSchedule.get(currentDay);
                if (day == null)
                    day = new ScheduleUnit();
                day.addSchedule(begin, end);
                slicedSchedule.put(currentDay, day);
            }
        }
    }

}
