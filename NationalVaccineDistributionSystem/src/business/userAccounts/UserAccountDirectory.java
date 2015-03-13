/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.userAccounts;

import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role, Employee employee){
        UserAccount user = new UserAccount();
        user.setUserName(name);
        user.setPassword(password);
        user.setEmployee(employee);
        user.setRole(role);
        user.setStatus("Active");
        userAccountList.add(user);
        return user;
    }
    
    public void removeUser(UserAccount user){
        userAccountList.remove(user);
    }
    
    public UserAccount authenticateUser(String name, String password){
        System.out.println("In authenticate user : " + name + " :  " + password);
        System.out.println("UserAccountListSize : " + userAccountList.size());
        for(UserAccount user: userAccountList){
            System.out.println("UserAccoutnNames in Authenticate user: " + user.getUserName());
            if(user.getUserName().equals(name) && user.getPassword().equals(password) && user.getStatus().equals("Active")){
                System.out.println("UserAuthenticateD: " + user.getUserName());
                return user;
            }
        }
    return null;
    }
    
    public UserAccount getUser(String name, String password){
        System.out.println("In authenticate user : " + name + " :  " + password);
        System.out.println("UserAccountListSize : " + userAccountList.size());
        for(UserAccount user: userAccountList){
            System.out.println("UserAccoutnNames in Authenticate user: " + user.getUserName());
            if(user.getUserName().equals(name) && user.getPassword().equals(password) && user.getStatus().equals("Active")){
                System.out.println("UserAuthenticateD: " + user.getUserName());
                return user;
            }
        }
    return null;
    }
    
     public boolean getUserValid(String name, String password){
        System.out.println("In authenticate user : " + name + " :  " + password);
        System.out.println("UserAccountListSize : " + userAccountList.size());
        for(UserAccount user: userAccountList){
            System.out.println("UserAccoutnNames in Authenticate user: " + user.getUserName());
            if(user.getUserName().equals(name) && user.getPassword().equals(password) && user.getStatus().equals("Active")){
                System.out.println("UserAuthenticateD: " + user.getUserName());
                return true;
            }
        }
    return false;
    }
    
    
    
    public boolean isUniqueUserName(String userName){
        for(UserAccount user: userAccountList){
            if(user.getUserName().equals(userName))
                return false;
        }
        return true;
    }
}
