/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Organization;

import business.Role.DistributorRole;
import business.Role.Role;
import java.util.ArrayList;

public class DistributorOrganization extends Organization{

    //private ShipmentCatalog catalog;
    
    public DistributorOrganization() {
        super(Type.Distributor.getValue());
       // catalog = new ShipmentCatalog();
    }
    
    
    @Override
        public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorRole());
        return roles;
    
    }

//    public ShipmentCatalog getCatalog() {
//        return catalog;
//    }
//
//    public void setCatalog(ShipmentCatalog catalog) {
//        this.catalog = catalog;
//    }

        
        
    
}
