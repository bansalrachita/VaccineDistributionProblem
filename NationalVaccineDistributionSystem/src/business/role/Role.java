/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Role;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.business.Business;
import business.userAccounts.UserAccount;
import javax.swing.JPanel;


public abstract class Role {

    public enum RoleType {

        Admin("System Admin"),
        Provider("Provider"),
        Distributor("Distributor"),
        Manufacturer("Manufacturer"),
        CDC("Center of Disease Control"),
        PHD("Public Health Department"),
        Clinic("Satellite Clinic");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel CreateWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business);

    public String toString(){
        String rolename = this.getClass().getName();
        //return this.getClass().getName();
        return this.getClass().getSimpleName();
    }
}
