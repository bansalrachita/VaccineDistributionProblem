/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.PHDAdminRole;

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
public class ManageProviderAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Business business;
    private Network network;
    private String cityNet;

    public ManageProviderAdminJPanel(JPanel userProcessContainer, Business business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        System.out.println("in ManageProviderAdminJPanel network" + network.getState() );
        System.out.println("in ManageProviderAdminJPanel network" + network.getNetWorkList().size() );
        populateNetwork();
        nameJLabel.setText("Manage Provider Admin Accounts >> " + network);

    }

    public void populateEnterprise(String n) {
        cmbEnterprise.removeAllItems();
                for (Network city : network.getNetWorkList()) {
                    System.out.println("populateEnterprise :: city:: " + city.getCity()  + " : " + n);
                    if (city.getCity().equals(n)) {
                         System.out.println("populateEnterprise :: city:: " + city.getCity());
 //                        System.out.println("populateEnterprise :: city.getEnterpriseDirectory().getEnterpriseList()size :: " + city.getEnterpriseDirectory().getEnterpriseList().size() );
//                         System.out.println("populateEnterprise :: city.getEnterpriseDirectory().getEnterpriseList() :: " + city.getEnterpriseDirectory().getEnterpriseList().get(0) );
                        for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                            System.out.println("populateEnterprise :: enterprise.getName():: " + enterprise.getName());
                            cmbEnterprise.addItem(enterprise.getName());
                        }
                    }
                }
    }

    public void populateJTable() {
        DefaultTableModel dtm = (DefaultTableModel) UserAccountJTable.getModel();
        dtm.setRowCount(0);
        System.out.println("Populate tabel for cmbEnterprise " + cmbEnterprise.getSelectedItem());
         String enterprise_selected = (String) cmbEnterprise.getSelectedItem();
      //  for(Network net: )
        
//        for (Network state : network.getNetWorkList()) {
//            System.out.println("State network : " + state.getState());
//            System.out.println("State network elements: " + state.getNetWorkList().get(0));
//            System.out.println("State network elements size: " + state.getNetWorkList().size());
            for(Network city: network.getNetWorkList()){
                System.out.println("City network : " + city.getCity());
                            // System.out.println("State network elements: " + city.getNetWorkList().get(0));
            //System.out.println("State network elements size: " + city.getNetWorkList().size());
                if(city.getCity().equals(cityNet)){
                    for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println("Enterprise Iterating: " + enterprise.getName()  + " enterprise seleted: " + enterprise_selected);
                        if(enterprise.getName().equals(enterprise_selected))
                        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    
                            Object[] row = new Object[7];
                            row[0] = user;
                            row[1] = user.getPassword();
                            row[2] = user.getStatus();
                            row[3] = user.getRole();
                            row[4] = user.getEmployee().getName();
                            row[5] = this.network.getState();
                            row[6] = city.getCity();
                            dtm.addRow(row);
                        }
                    }   
        }
    }
    }

    public void populateNetwork() {
        cmbNetwork.removeAllItems();
            for (Network city : network.getNetWorkList()) {
                 {
                    cmbNetwork.addItem(city.getCity());
                }
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

        nameJLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 810, 36));

        jLabel2.setText("Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, 20));

        cmbNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbNetworkMouseClicked(evt);
            }
        });
        add(cmbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 30));

        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 30));

        cmbEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbEnterpriseMouseClicked(evt);
            }
        });
        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, 30));

        UserAccountJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Password", "Status", "Role", "EmployeeName", "State", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UserAccountJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 750, 240));

        btnAddAdmin.setText("Add Admin >>");
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });
        add(btnAddAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 140, 30));

        btnUpdateAdmin.setText("Update Admin>>");
        btnUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdminActionPerformed(evt);
            }
        });
        add(btnUpdateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 140, 30));

        btnRefresh.setText("Refresh>>");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 140, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbNetworkMouseClicked
        cityNet = (String) cmbNetwork.getSelectedItem();
        if (cityNet != null) {
            nameJLabel.setText("Manage Provider Admin >> " + network + " >> " + cityNet);
            populateEnterprise(cityNet);
//            populateJTable();
        }
    }//GEN-LAST:event_cmbNetworkMouseClicked

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        String enterprise = (String) cmbEnterprise.getSelectedItem();
       // System.out.println("enterprise::" + enterprise);
        for (Network city : network.getNetWorkList()) {
            for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println("e.getName() " + e.getName() + "enterprise " + enterprise );
                if (e.getName().equals(enterprise)) {
                    System.out.println("e::" + e.getName());
                    AddAdminJPanel panel = new AddAdminJPanel(userProcessContainer, e, business);
                    userProcessContainer.add("AddAdminJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        }

    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void btnUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdminActionPerformed
        int selectedRow = UserAccountJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a UserAccount.");
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

    private void cmbEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEnterpriseMouseClicked
        // TODO add your handling code here:
        populateJTable();
    }//GEN-LAST:event_cmbEnterpriseMouseClicked


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
