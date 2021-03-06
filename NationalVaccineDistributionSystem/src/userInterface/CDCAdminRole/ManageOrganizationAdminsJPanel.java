/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.CDCAdminRole;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.business.Business;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rachita
 */
public class ManageOrganizationAdminsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Organization organization;
    private Business business;
    private Enterprise enterprise;
    
    public ManageOrganizationAdminsJPanel(JPanel userProcessContainer,Enterprise enterprise,Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.business=business;
        //nameJLabel.setText("Add National Distributor Admin for " + organization.getName());
        populatecmbOrganization();
        nameJPanel.setText("Manage Organization Admins Work Area >> " + enterprise.getName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRefresh = new javax.swing.JButton();
        AddAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        nameJPanel = new javax.swing.JLabel();
        UpdateAdmin = new javax.swing.JButton();
        cmbOrganization = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh>>");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 180, 30));

        AddAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddAdmin.setText("Add Admin>>");
        AddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminActionPerformed(evt);
            }
        });
        add(AddAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 180, 30));

        UserJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Role", "Status", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UserJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 700, 160));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, 30));

        nameJPanel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(nameJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 620, 40));

        UpdateAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateAdmin.setText("Update Admin>>");
        UpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAdminActionPerformed(evt);
            }
        });
        add(UpdateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, 180, 30));

        add(cmbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void AddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminActionPerformed
        Organization o = (Organization) cmbOrganization.getSelectedItem();
        organization = o;
        AddOrganizationAdmin panel = new AddOrganizationAdmin(userProcessContainer,business,organization);
        userProcessContainer.add("AddOrganizationAdmin",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_AddAdminActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void UpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAdminActionPerformed
        int selectedRow = UserJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a Row.");
            return;
        }
       
        Organization o = (Organization) cmbOrganization.getSelectedItem();
        UpdateOrganizationAdminJPanel panel = new UpdateOrganizationAdminJPanel(userProcessContainer, organization);
        userProcessContainer.add("UpdateOrganizationAdminJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_UpdateAdminActionPerformed

    private void populatecmbOrganization(){
        cmbOrganization.removeAllItems();
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList()){
            cmbOrganization.addItem(o);
        }
    }
    private void populateTable(){
                organization = (Organization) cmbOrganization.getSelectedItem();
                  if(organization.getType().equals(Organization.Type.Distributor)||organization.getType().equals(Organization.Type.Manfacturer)){
                      DefaultTableModel dtm = (DefaultTableModel) UserJTable.getModel();
                      dtm.setRowCount(0);
                      for(UserAccount user: organization.getUserAccountDirectory().getUserAccountList()){
                      Object[] row = new Object[5];
                      row[0] = user;
                      row[1] = user.getPassword();
                      row[2] = user.getRole();
                      row[3] = user.getStatus();
                      row[4]= user.getEmployee().getName();
                      dtm.addRow(row);
                     }
                  }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAdmin;
    private javax.swing.JButton UpdateAdmin;
    private javax.swing.JTable UserJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJPanel;
    // End of variables declaration//GEN-END:variables
}
