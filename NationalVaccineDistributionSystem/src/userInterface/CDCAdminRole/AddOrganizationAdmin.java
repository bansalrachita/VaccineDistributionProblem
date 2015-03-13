/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.CDCAdminRole;

import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.DistributorRole;
import business.Role.ManufactureRole;
import business.business.Business;
import business.network.Network;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class AddOrganizationAdmin extends javax.swing.JPanel {
    
private Business business;
private Organization organization;
JPanel userProcessContainer;
private UserAccount user;

    public AddOrganizationAdmin(JPanel userProcessContainer,Business business,Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.organization=organization;
        this.business=business;
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
        btnBack1 = new javax.swing.JButton();
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

        btnBack1.setText("<<Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

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

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        boolean flag=true;
        try{
            String name = txtUserName.getText();
            String password = txtPassword.getText();
            String EmpName = txtEmployee.getText();
            
            Employee employee = organization.getEmployeeDirectory().createEmployee(EmpName);
            for(Network network: business.getNetworkList()){
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                        //System.out.println("user" + user + "e" + e.getName());
                        if(!e.getUserAccountDirectory().isUniqueUserName(name)){
                            //System.out.println("flag" + flag + user + user);
                            flag=false;
                            break;
                        }
                        
                if(flag){
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                        if(!o.getUserAccountDirectory().isUniqueUserName(name)){
                            flag=false;
                            break;
                        }
                        for(Network state: network.getNetWorkList()){
                            for(Enterprise e1: state.getEnterpriseDirectory().getEnterpriseList()){
                                if(!e1.getUserAccountDirectory().isUniqueUserName(name)){
                                    flag=false;
                                    break;
                                }
                                
                                if(flag){
                                    for(Organization o1: e1.getOrganizationDirectory().getOrganizationList()){
                                        if(!o1.getUserAccountDirectory().isUniqueUserName(name)){
                                            flag=false;
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
            //System.out.println("flag " + flag);
            if(flag){
                if(name.equals("") || password.equals("") || EmpName.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter valid values");
                    return;
                }
                
                if(organization.getType().equals(Organization.Type.Distributor)){
                user = organization.getUserAccountDirectory().createUserAccount(name, password, new DistributorRole(), employee);   
                JOptionPane.showMessageDialog(null, "Admin added successfully.");
                txtEmployee.setEnabled(false);
                txtPassword.setEnabled(false);
                txtUserName.setEnabled(false);
                btnAddAdmin.setEnabled(false);
                }
                else if(organization.getType().equals(Organization.Type.Manfacturer)){
                     user = organization.getUserAccountDirectory().createUserAccount(name, password, new ManufactureRole(), employee);   
                     txtEmployee.setEnabled(false);
                     txtPassword.setEnabled(false);
                     txtUserName.setEnabled(false);
                     btnAddAdmin.setEnabled(false);
                     warningJLabel.setText(null);
                     JOptionPane.showMessageDialog(null, "Admin added successfully.");
                     
                }
            }
            else{
                warningJLabel.setEnabled(true);
                warningJLabel.setText("**UserName should be unique.");
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Account cannot be added.");
            organization.getUserAccountDirectory().removeUser(user);
            return;
        }
    }//GEN-LAST:event_btnAddAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnBack1;
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
