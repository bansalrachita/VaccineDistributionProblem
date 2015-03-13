/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Employee;

import java.util.ArrayList;

public class EmployeeDirectory {
    ArrayList<Employee> employeeList ;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee e = new Employee();
        e.setName(name);
        employeeList.add(e);
        return e;
    }

    
    
    
}
