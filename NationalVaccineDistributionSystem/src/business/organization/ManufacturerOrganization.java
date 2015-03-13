/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Address.Address;
import business.Manufacturer.ManufacturerDirectory;
import business.Role.ManufactureRole;
import business.Role.Role;
import java.util.ArrayList;

public class ManufacturerOrganization extends Organization{

    private ManufacturerDirectory manufacturerDirectory;
    private Address address;
    
    public ManufacturerOrganization() {
        super(Organization.Type.Manfacturer.getValue());
        manufacturerDirectory = new ManufacturerDirectory();
         address=new Address();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
  

    @Override
      public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufactureRole());
        return roles;
    } 

    public ManufacturerDirectory getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public void setManufacturerDirectory(ManufacturerDirectory manufacturerDirectory) {
        this.manufacturerDirectory = manufacturerDirectory;
    }

      
    
}
