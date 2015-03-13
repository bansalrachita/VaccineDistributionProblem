/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.CDCAdminRole;

import business.Enterprise.Enterprise;
import business.business.Business;
import business.network.Network;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.enterpriseUserAccounts.AddAdminJPanel;
import userInterface.enterpriseUserAccounts.UpdateAdminJPanel;

/**
 *
 * @author Rachita
 */
public class ManagePHDAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Business business;
    private Network network;
    
    public ManagePHDAdminJPanel(JPanel userProcessContainer,Business business,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.network=network;
        populateNetwork();
        nameJLabel.setText("Manage Public Health Dept. Admin Accounts >> " + network );
        
    }
    
    public void populateEnterprise(String network){
        cmbEnterprise.removeAllItems();
        for(Network country : business.getNetworkList()){
            for(Network state: country.getNetWorkList()){
                if(state.getState().equals(network)){
                    for(Enterprise enterprise: state.getEnterpriseDirectory().getEnterpriseList()){
                        cmbEnterprise.addItem(enterprise.getName());
                    }
                }
            }
        }
    }
    
    public void populateJTable(){
        DefaultTableModel dtm = (DefaultTableModel) UserAccountJTable.getModel();
        dtm.setRowCount(0);
        for(Network state: network.getNetWorkList()){
            for(Enterprise enterprise:state.getEnterpriseDirectory().getEnterpriseList()){
                for(UserAccount user:enterprise.getUserAccountDirectory().getUserAccountList()){
                     Object[] row = new Object[6];
                     row[0] = user;
                     row[1]=user.getPassword();
                     row[2]=user.getStatus();
                     row[3]=user.getRole();
                     row[4]=user.getEmployee().getName();
                     row[5]=state.getState();
                     dtm.addRow(row);
                }
            }
        }
       
    
    }
    public void populateNetwork(){
        cmbNetwork.removeAllItems();
        for(Network state: network.getNetWorkList()){
            cmbNetwork.addItem(state.getState());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserAccountJTable = new javax.swing.JTable();
        btnAddAdmin = new javax.swing.JButton();
        btnUpdateAdmin = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameJLabel.setText("                      ");
        nameJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 810, 36));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 80, 20));

        cmbNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbNetworkMouseClicked(evt);
            }
        });
        add(cmbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 190, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 30));

        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 190, 30));

        UserAccountJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Password", "Status", "Role", "EmployeeName", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UserAccountJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 750, 240));

        btnAddAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddAdmin.setText("Add Admin >>");
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });
        add(btnAddAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, 160, 30));

        btnUpdateAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdateAdmin.setText("Update Admin>>");
        btnUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdminActionPerformed(evt);
            }
        });
        add(btnUpdateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, 160, 30));

        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh>>");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 160, 30));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbNetworkMouseClicked
        String state = (String) cmbNetwork.getSelectedItem();
        if(state!=null){
            nameJLabel.setText("Manage Public Health Dept. Admin Accounts >> " + network +" >> " + state);
            populateEnterprise(state);
            populateJTable();
        }
    }//GEN-LAST:event_cmbNetworkMouseClicked

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        String enterprise = (String) cmbEnterprise.getSelectedItem();
        System.out.println("enterprise::" + enterprise);
        for(Network state: network.getNetWorkList()){
            for(Enterprise e: state.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(enterprise)){
                    System.out.println("e::" + e.getName() );
                    AddAdminJPanel panel = new AddAdminJPanel(userProcessContainer,e,business);
                    userProcessContainer.add("AddAdminJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        }
        
    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void btnUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdminActionPerformed
        int selectedRow = UserAccountJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please Select a UserAccount.");
            return;
        }
        UserAccount user = (UserAccount) UserAccountJTable.getValueAt(selectedRow, 0);
        UpdateAdminJPanel panel = new UpdateAdminJPanel(userProcessContainer, user);
        userProcessContainer.add("UpdatePHDAdminJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateAdminActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateJTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserAccountJTable;
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateAdmin;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    // End of variables declaration//GEN-END:variables
}
