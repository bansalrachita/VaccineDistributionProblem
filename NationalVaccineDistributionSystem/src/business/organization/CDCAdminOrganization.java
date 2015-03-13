/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Role.CDCAdminRole;
import business.Role.Role;
import java.util.ArrayList;

public class CDCAdminOrganization extends Organization{

    public CDCAdminOrganization() {
        super(Organization.Type.CDCEnterpriseAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCAdminRole());
        return roles;
    }
    
}
