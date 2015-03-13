/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Role.Role;
import business.WorkRequest.WorkQueue;
import business.userAccounts.UserAccountDirectory;
import java.util.ArrayList;

public abstract class Organization {
    private int organizationID;
    private static int counter;
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    private Type type;
    private WorkQueue workQueue;

            
    public Organization(String name) {
        this.name = name;
        this.organizationID = counter;
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        workQueue=new WorkQueue();
        counter++;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public enum Type{
             
         Distributor("Distributor Organization"){
            
        }, Clinic("Clinic Organization"){
            
        }, Manfacturer("Manufacture Organization"){
            
        },SystemAdmin("System Administrator"){
            
        },CDCEnterpriseAdmin("Center of Disease Control Admin"){
            
        },PHDEnterPriseAdmin("Public Health Department Admin"){
            
        },Provider("Provider"){
            
        };
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Type getType(){
        return type;
    }
    public void setType(Type t){
        this.type=t;
    }
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
   
    
    public String toString(){
        return this.name;
    }
    
   
    
}
