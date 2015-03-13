/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.DistributorRole;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.business.Business;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class DistributorWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Organization organization;
    Enterprise enterprise;
    UserAccount userAccount;
    
    public DistributorWorkAreaJPanel(JPanel userProcessContainer,Business business,Organization organization, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.enterprise=enterprise;
        this.organization=organization;
        this.userAccount=userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddEmployee = new javax.swing.JButton();
        btnViewShipmentOrder = new javax.swing.JButton();
        btnProcessCDCRequest = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("      Welcome to the Distributor Work Area");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 480, 53));

        btnAddEmployee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddEmployee.setText("Manage Employees>>");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 399, 34));

        btnViewShipmentOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewShipmentOrder.setText("View Shipment Orders>>");
        btnViewShipmentOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewShipmentOrderActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewShipmentOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 400, 30));

        btnProcessCDCRequest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnProcessCDCRequest.setText("Process CDC Requests>>");
        btnProcessCDCRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessCDCRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnProcessCDCRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 400, 30));

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        
        ManageEmployeesJPanel panel = new ManageEmployeesJPanel(userProcessContainer, business, organization);
        userProcessContainer.add("ManageEmployeesJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnProcessCDCRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessCDCRequestActionPerformed
        MaangeCDCRequestsJPanel panel = new MaangeCDCRequestsJPanel(userProcessContainer, organization, userAccount, business,enterprise);
        userProcessContainer.add("MaangeCDCRequestsJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessCDCRequestActionPerformed

    private void btnViewShipmentOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewShipmentOrderActionPerformed
        ViewShipmentOrdersJPanel panel = new ViewShipmentOrdersJPanel(userProcessContainer,organization,enterprise);
        userProcessContainer.add("ViewShipmentOrdersJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewShipmentOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnProcessCDCRequest;
    private javax.swing.JButton btnViewShipmentOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
