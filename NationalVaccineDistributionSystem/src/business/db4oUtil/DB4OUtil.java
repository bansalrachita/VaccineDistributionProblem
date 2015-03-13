/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db4oUtil;
import business.business.Business;
import business.business.ConfigureBusiness;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

public class DB4OUtil {
//    private static final String FILENAME = "C:\\ADE\\DB4O_Util_Files\\DBFile.db4o";
    private static final String FILENAME = "DBFile.db4o";
    private static DB4OUtil db4oUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if(db4oUtil==null){
            db4oUtil = new DB4OUtil();
        }
        return db4oUtil;
    }
    
    public synchronized static void shutDown(ObjectContainer connection){
        if(connection!=null){
            connection.close();
        }
    }
    
    private ObjectContainer createConnection(){
        ObjectContainer dataBase =null;
        try{
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);
            //Register your top most Class here
            config.common().objectClass(Business.class).cascadeOnUpdate(true);
            // Change to the object you want to save
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            dataBase = db;
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        return dataBase;
    }
    
    public synchronized void storeSystem(Business business){
        ObjectContainer connection = createConnection();
        connection.store(business);
        connection.commit();
        connection.close();
    }
    
    public Business retrieveSystem(){
        ObjectContainer connection = createConnection();
        ObjectSet<Business> business = connection.query(Business.class);
        Business b;
        if (business.size() == 0){
            b = ConfigureBusiness.configure();  
            // If there's no System in the record, create a new one
        }
        else{
           b = business.get(business.size()-1);
            // b = business.get(0);
        }
        connection.close();
        return b;
        
    }
}
