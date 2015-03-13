/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package business.userAccounts;

import business.Employee.Employee;
import business.Role.Role;
import business.WorkRequest.WorkQueue;

public class UserAccount {
    private Employee employee;
    private String userName;
    private String password;
    private String status;
    private Role role;
    private WorkQueue workQueue;
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public String toString(){
        return this.userName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    
}

