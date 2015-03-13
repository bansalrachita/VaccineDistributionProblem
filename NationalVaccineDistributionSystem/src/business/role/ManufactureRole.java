/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Role;

import business.Enterprise.CDCEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.business.Business;
import business.userAccounts.UserAccount;
import javax.swing.JPanel;
import userInterface.ManufacturerRole.ManufacturerWorkAreaJPanel;

public class ManufactureRole extends Role {

    @Override
    public JPanel CreateWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
       return new ManufacturerWorkAreaJPanel(userProcessContainer,userAccount,organization,(CDCEnterprise)enterprise,business);
    }
    
}
