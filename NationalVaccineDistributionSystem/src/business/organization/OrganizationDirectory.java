/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;

        if(type.getValue().equals(Type.Distributor.getValue())){
            organization = new DistributorOrganization();
            organization.setName(name);
            organizationList.add(organization);
        }
        if(type.getValue().equals(Type.Manfacturer.getValue())){
            organization = new ManufacturerOrganization();
            organization.setName(name);
            organizationList.add(organization);
            
        }
         if(type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organization.setName(name);
            organization.setType(type);
            organizationList.add(organization);
            
        }
        return organization;
    }
    
}
