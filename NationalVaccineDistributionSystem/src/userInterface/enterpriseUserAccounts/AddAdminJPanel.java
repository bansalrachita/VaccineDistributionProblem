/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.enterpriseUserAccounts;

import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.CDCAdminRole;
import business.Role.PHDAdminRole;
import business.Role.ProviderRole;
import business.business.Business;
import business.network.Network;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class AddAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount user;
    private Business business;

    public AddAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAddAdmin = new javax.swing.JButton();
        txtEmployee = new javax.swing.JTextField();
        warningJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Add Admin UserAccount");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 39, 315, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        jLabel2.setText("UserName");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 20));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 210, 30));

        jLabel6.setText("Employee Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 90, -1));

        btnAddAdmin.setText("Add Admin>>");
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });
        add(btnAddAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, 30));
        add(txtEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 210, 30));

        warningJLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(warningJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        boolean flag = true;
        try {

            String name = txtUserName.getText();
            String password = txtPassword.getText();
            String EmpName = txtEmployee.getText();

            Employee employee = enterprise.getEmployeeDirectory().createEmployee(EmpName);

            for (Network network : business.getNetworkList()) {
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    //for(UserAccount user: e.getUserAccountDirectory().getUserAccountList()){
                    //System.out.println("enterprise UAD : " + user + "e" + e.getUserAccountDirectory().getUserAccountList());
                    System.out.println("enterprise UAD : ");
                    for (UserAccount s : e.getUserAccountDirectory().getUserAccountList()) {
                        System.out.println("UserAccount Enterprise UAD:" + s.getUserName());
                    }

                    if (!e.getUserAccountDirectory().isUniqueUserName(name)) {
                        // System.out.println("flag" + flag + user + user);
                        flag = false;
                        System.out.println("No unique in enterprise" + flag);
                        break;
                    }
//                }
                    if (flag) {

                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {

                            System.out.println("ORG UAD : ");
                            for (UserAccount s : o.getUserAccountDirectory().getUserAccountList()) {
                                System.out.println("UserAccount ORG UAD:" + s.getUserName());
                            }

                            if (!o.getUserAccountDirectory().isUniqueUserName(name)) {
                                flag = false;
                                System.out.println("No unique in org user account" + flag);
                                break;
                            }
                            for (Network state : network.getNetWorkList()) {
                                for (Enterprise e1 : state.getEnterpriseDirectory().getEnterpriseList()) {

                                    System.out.println("State UAD : ");
                                    for (UserAccount s : e1.getUserAccountDirectory().getUserAccountList()) {
                                        System.out.println("UserAccount state UAD:" + s.getUserName());
                                    }

                                    if (!e1.getUserAccountDirectory().isUniqueUserName(name)) {
                                        flag = false;
                                        System.out.println("No unique in state user account" + flag);
                                        break;
                                    }
                                    if (flag) {
                                        for (Organization o1 : e1.getOrganizationDirectory().getOrganizationList()) {

                                            System.out.println("State Org UAD : ");
                                            for (UserAccount s : o1.getUserAccountDirectory().getUserAccountList()) {
                                                System.out.println("UserAccount state org UAD:" + s.getUserName());
                                            }

                                            if (!o1.getUserAccountDirectory().isUniqueUserName(name)) {
                                                flag = false;
                                                System.out.println("No unique in state org user account" + flag);
                                                break;
                                            }
                                        }
                                        for (Network city : state.getNetWorkList()) {

                                            for (Enterprise enterprise_city : city.getEnterpriseDirectory().getEnterpriseList()) {

                                                System.out.println("City enterprise UAD : ");
                                                for (UserAccount s : enterprise_city.getUserAccountDirectory().getUserAccountList()) {
                                                    System.out.println("UserAccount city enterpris org UAD:" + s.getUserName());
                                                }

                                                if (!enterprise_city.getUserAccountDirectory().isUniqueUserName(name)) {
                                                    flag = false;
                                                    System.out.println("No unique in city user account" + flag);
                                                    break;
                                                }
                                                if (flag) {
                                                    for (Organization organization_city : enterprise_city.getOrganizationDirectory().getOrganizationList()) {

                                                        System.out.println("City org UAD : ");
                                                        for (UserAccount s : organization_city.getUserAccountDirectory().getUserAccountList()) {
                                                            System.out.println("UserAccount city org UAD:" + s.getUserName());
                                                        }

                                                        if (!organization_city.getUserAccountDirectory().isUniqueUserName(name)) {
                                                            flag = false;
                                                            System.out.println("No unique in city org user account" + flag);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }

                    }
                }
            }
          //  System.out.println("flag " + flag);
            //boolean flag = enterprise.getUserAccountDirectory().isUniqueUserName(name);
            if (flag) {
                if (name.equals("") || password.equals("") || EmpName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter valid values");
                    return;
                }

                // System.out.println("enterprise.getEnterpriseType()" + enterprise.getEnterpriseType());
                if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.CDC)) {
                    System.out.println("enterprise CDC " + enterprise.getName() + business);
                    user = enterprise.getUserAccountDirectory().createUserAccount(name, password, new CDCAdminRole(), employee);
                    JOptionPane.showMessageDialog(null, "Center of disease control Admin Added successfully.");
                    txtUserName.setEnabled(false);
                    txtPassword.setEnabled(false);
                    txtEmployee.setEnabled(false);
                    btnAddAdmin.setEnabled(false);
                    warningJLabel.setText(null);
                } else if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.PHD)) {
                    System.out.println("enterprise PHD " + enterprise.getName() + business);
                    user = enterprise.getUserAccountDirectory().createUserAccount(name, password, new PHDAdminRole(), employee);
                    JOptionPane.showMessageDialog(null, "Public health department Admin Added successfully.");
                    txtUserName.setEnabled(false);
                    txtPassword.setEnabled(false);
                    txtEmployee.setEnabled(false);
                    btnAddAdmin.setEnabled(false);
                    warningJLabel.setText(null);
                } else if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Provider)) {
                    System.out.println("enterprise Provider " + enterprise.getName() + business);
                    user = enterprise.getUserAccountDirectory().createUserAccount(name, password, new ProviderRole(), employee);
                    JOptionPane.showMessageDialog(null, "Provider Admin Added successfully.");
                    txtUserName.setEnabled(false);
                    txtPassword.setEnabled(false);
                    txtEmployee.setEnabled(false);
                    btnAddAdmin.setEnabled(false);
                    warningJLabel.setText(null);
                }
            } else {
                warningJLabel.setEnabled(true);
                warningJLabel.setText("**UserName should be unique.");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Account cannot be added.");
            enterprise.getUserAccountDirectory().removeUser(user);
            return;
        }
    }//GEN-LAST:event_btnAddAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEmployee;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel warningJLabel;
    // End of variables declaration//GEN-END:variables
}