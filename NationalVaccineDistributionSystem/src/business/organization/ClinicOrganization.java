/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Address.Address;
import business.Inventory.Inventory;
import business.order.OrderCatalog;
import business.Role.ProviderRole;
import business.Role.Role;
import java.util.ArrayList;

public class ClinicOrganization extends Organization{

    private Address address;
    //private ClinicDirectory clinicDirectory;
    private Inventory ClinicInventory;
    private OrderCatalog masterOrderCatalog;
    
    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
        address=new Address();
        ClinicInventory = new Inventory();
        masterOrderCatalog=new OrderCatalog();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public ClinicDirectory getClinicDirectory() {
//        return clinicDirectory;
//    }
//
//    public void setClinicDirectory(ClinicDirectory clinicDirectory) {
//        this.clinicDirectory = clinicDirectory;
//    }
    public Inventory getClinicInventory() {
        return ClinicInventory;
    }

    public void setClinicInventory(Inventory ClinicInventory) {
        this.ClinicInventory = ClinicInventory;
    }

    public OrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(OrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    

    
}
