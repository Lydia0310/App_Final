//package Business.DB4OUtil;
//
//import business.ConfigureABusiness;
//import business.Business;
//import com.db4o.Db4oEmbedded;
//import com.db4o.ObjectContainer;
//import com.db4o.ObjectSet;
//import com.db4o.config.EmbeddedConfiguration;
//import com.db4o.ta.TransparentPersistenceSupport;
//
///**
// *
// * @author Lydia
// */
//public class DB4OUtil {
//
//    private static final String FILENAME = "C:\\Users\\Lydia\\Desktop\\Documents\\Application\\DataBank.db4o"; // path to the data store
//    private static DB4OUtil dB4OUtil;
//
//    public synchronized static DB4OUtil getInstance(){
//        if (dB4OUtil == null){
//            dB4OUtil = new DB4OUtil();
//        }
//        return dB4OUtil;
//    }
//
//    protected synchronized static void shutdown(ObjectContainer conn) {
//        if (conn != null) {
//            conn.close();
//        }
//    }
//
//    private ObjectContainer createConnection() {
//        try {
//            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
//            config.common().add(new TransparentPersistenceSupport());
//            //Controls the number of objects in memory
//            config.common().activationDepth(Integer.MAX_VALUE);
//            //Controls the depth/level of updation of Object
//            config.common().updateDepth(Integer.MAX_VALUE);
//
//            //Register your top most Class here
//            config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save
//
//            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
//            return db;
//        } catch (Exception ex) {
//            System.out.print(ex.getMessage());
//        }
//        return null;
//    }
//
//    public synchronized void storeSystem(Business business) {
//        ObjectContainer conn = createConnection();
//        conn.store(business);
//        conn.commit();
//        conn.close();
//    }
//
//    public Business retrieveSystem(){
//        ObjectContainer conn = createConnection();
//        ObjectSet<Business> businesses = conn.query(Business.class); // Change to the object you want to save
//        Business business;
//        if (businesses.size() == 0){
//            business = ConfigureABusiness.configure();  // If there's no System in the record, create a new one
//        }
//        else{
//            business = businesses.get(0);
//        }
//        conn.close();
//        return business;
//    }
//}
