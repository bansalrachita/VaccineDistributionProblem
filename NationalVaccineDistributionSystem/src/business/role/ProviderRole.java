/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Role;

import business.Enterprise.Enterprise;
import business.Enterprise.ProviderEnterprise;
import business.Organization.Organization;
import business.business.Business;
import business.userAccounts.UserAccount;
import javax.swing.JPanel;
import userInterface.ProviderRole.ProviderWorkAreaJPanel;

public class ProviderRole extends Role{

    @Override
    public JPanel CreateWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new ProviderWorkAreaJPanel(userProcessContainer,userAccount,organization,(ProviderEnterprise)enterprise,business);
    }
    
}
