/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.ClinicRole;


import business.Employee.Employee;
import business.Inventory.Inventory;
import business.Organization.ClinicOrganization;

public class Clinic extends ClinicOrganization{
    private Employee employee;
//    private Inventory clinicInventory;
//    private Address clinicAddress;
//    private String clinicName;
    
    public Clinic(){
//        clinicInventory=new Inventory();
     //   clinicAddress = new Address();
        employee=new Employee();
    };
    
     public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

//    public Inventory getClinicInventory() {
//        return clinicInventory;
//    }
//
//    public void setClinicInventory(Inventory clinicInventory) {
//        this.clinicInventory = clinicInventory;
//    }

//    public Address getClinicAddress() {
//        return clinicAddress;
//    }
//
//    public void setClinicAddress(Address clinicAddress) {
//        this.clinicAddress = clinicAddress;
//    }
//
//    public String getClinicName() {
//        return clinicName;
//    }
//
//    public void setClinicName(String clinicName) {
//        this.clinicName = clinicName;
//    }
//    
    
    
//    public String toString(){
//        return clinicName;
//    }
//    
    
}
