/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Enterprise;

import business.Role.Role;
import business.Inventory.Inventory;
import business.Inventory.VaccineCatalog;
import business.Role.CDCAdminRole;
import java.util.ArrayList;


public class CDCEnterprise extends Enterprise{

    private Inventory inventory;
    private VaccineCatalog vaccineCatalog;

     
       
    public CDCEnterprise(String name) {
        super(name);
        inventory=new Inventory();
        vaccineCatalog=new VaccineCatalog();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public VaccineCatalog getVaccineCatalog1() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog1(VaccineCatalog vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCAdminRole());
        return roles;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}

