/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Organization;

import business.Role.Role;
import business.Role.SystemAdminRole;
import java.util.ArrayList;

public class SystemAdmin extends Organization{

    public SystemAdmin() {
        super(Type.SystemAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    
    }

  
    
}
