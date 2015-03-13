/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Enterprise;

import business.Role.PHDAdminRole;
import business.Role.Role;
import java.util.ArrayList;


public class PHDEnterprise extends Enterprise {

    private int population;
    
    public PHDEnterprise(String name) {
        super(name);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PHDAdminRole());
        return roles;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
