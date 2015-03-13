/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Employee;

public class Employee {
    private String name;
    private String EmpID;
    static int counter=1;
    
    public Employee() {
        EmpID = "E"+ counter;
        counter++;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return EmpID;
    }

    public String toString(){
        return EmpID;
    }
    
    
    
}
