/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Role;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.ClinicOrganization;
import business.business.Business;
import business.userAccounts.UserAccount;
import javax.swing.JPanel;
import userInterface.ClinicRole.ClinicWorkAreaJPanel;

public class ClinicRole extends Role{

    @Override
    public JPanel CreateWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new ClinicWorkAreaJPanel(userProcessContainer,userAccount,(ClinicOrganization)organization,enterprise,business);
    }
    
}
