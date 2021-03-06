/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.ClinicRole;

import business.Enterprise.Enterprise;
import business.Organization.ClinicOrganization;
import business.business.Business;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;



public class ClinicWorkAreaJPanel extends javax.swing.JPanel {

   JPanel userProcessContainer;
   private Business business;
   private ClinicOrganization clinicOrganization;
   private Enterprise enterprise;
   private UserAccount userAccount;
   
    public ClinicWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,ClinicOrganization clinicOrganization,Enterprise enterprise,Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.enterprise=enterprise;
        this.clinicOrganization=clinicOrganization;
        this.userAccount=userAccount;
        nameJLabel.setText("Welcome To The Clinic Work Area," + userAccount.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameJLabel = new javax.swing.JLabel();
        btnManageInventory = new javax.swing.JButton();
        btnCreateRequest = new javax.swing.JButton();
        btnViewRequest = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameJLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 900, 50));

        btnManageInventory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageInventory.setText("Manage Inventory >>");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });
        add(btnManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 350, 30));

        btnCreateRequest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreateRequest.setText("Place An Order>>");
        btnCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRequestActionPerformed(evt);
            }
        });
        add(btnCreateRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 350, 30));

        btnViewRequest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewRequest.setText("View Shipping Orders>>");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });
        add(btnViewRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 350, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed

        ManageInventory panel = new ManageInventory(userProcessContainer,business,clinicOrganization,enterprise);
        userProcessContainer.add("ManageInventory", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed

    private void btnCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRequestActionPerformed
        CreateOrderRequestJPanel panel = new CreateOrderRequestJPanel(userProcessContainer, clinicOrganization, enterprise, userAccount, business);
        userProcessContainer.add("CreateOrderRequestJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateRequestActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed

        ViewOrdersJPanel panel = new ViewOrdersJPanel(userProcessContainer,clinicOrganization,enterprise);
        userProcessContainer.add("ViewOrderJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateRequest;
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JLabel nameJLabel;
    // End of variables declaration//GEN-END:variables
}
