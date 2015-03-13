/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.ProviderRole;

import business.Enterprise.Enterprise;
import business.Enterprise.ProviderEnterprise;
import business.Organization.Organization;
import business.business.Business;
import business.network.Network;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Rachita
 */
public class ProviderWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Business business;
    private Organization organization;
    UserAccount userAccount;
    ProviderEnterprise enterprise;
    Network cityNet;
    Enterprise phdEnterprise;
    Network stateNet;
    public ProviderWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization,ProviderEnterprise enterprise, Business business ) {
        initComponents();
        this.userAccount= userAccount;
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.organization=organization;
        
        nameJLable.setText("Welcome to Provider Work Area" + userAccount);
        
        for (Network network : business.getNetworkList()) {
            for (Network state : network.getNetWorkList()) {
                for (Enterprise phd : state.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Network city : state.getNetWorkList()) {
                        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                            if (e.getName().equals(enterprise.getName())) {
                                cityNet = city;
                                phdEnterprise=phd;
                                stateNet=state;
                            }
                        }
                    }
                }
            }
        }
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
        nameJLable = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnManageClinics = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnManageInventory = new javax.swing.JButton();
        btnClinicRequest = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        systemJTree = new javax.swing.JTree();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameJLable.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameJLable.setText("                        ");
        nameJLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(nameJLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 860, 60));

        jButton1.setText("Create An Order>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 380, 30));

        btnManageClinics.setText("Manage Associated Clinics>>");
        btnManageClinics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageClinicsActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageClinics, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 380, 30));

        btnManageAdmin.setText("Manage Clinic User Accounts >>");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 380, 30));

        btnManageInventory.setText("Manage Inventory>>");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 380, 30));

        btnClinicRequest.setText("Manage Clinic Request>>");
        btnClinicRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnClinicRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 380, 30));

        btnView.setText("View Orders>>");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel2.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 380, 30));

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        systemJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        systemJTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemJTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(systemJTree);

        jSplitPane1.setLeftComponent(jScrollPane1);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void populateTree() {

                    DefaultTreeModel dtm = (DefaultTreeModel) systemJTree.getModel();
                    ArrayList<Network> networkList = cityNet.getNetWorkList();
                    ArrayList<Enterprise> cityEnterpriseList;
                    ArrayList<Organization> organizationList = null;
                    DefaultMutableTreeNode states = new DefaultMutableTreeNode("Providers");
                    DefaultMutableTreeNode root = (DefaultMutableTreeNode) dtm.getRoot();
                    root.insert(states, 0);
                    Enterprise providerEnterprise;
                    Organization organization;
                    DefaultMutableTreeNode cityNode;
                    DefaultMutableTreeNode organizationNode;
                    DefaultMutableTreeNode enterpriseNode;


                    for (int l = 0; l < networkList.size(); l++) {
                        cityNet = networkList.get(l);
                        cityNode = new DefaultMutableTreeNode(cityNet.getState());
                        states.insert(cityNode, l);
                        System.out.println("cityNode" + cityNode);

                        cityEnterpriseList = cityNet.getEnterpriseDirectory().getEnterpriseList();
                        for (int j = 0; j < cityEnterpriseList.size(); j++) {
                            providerEnterprise = cityEnterpriseList.get(j);
                            enterpriseNode = new DefaultMutableTreeNode(providerEnterprise.getName());
                            cityNode.insert(enterpriseNode, j);
                            
                            for (int k = 0; k < organizationList.size(); k++) {
                                organization = organizationList.get(k);
                                organizationNode = new DefaultMutableTreeNode(organization.getName());
                                enterpriseNode.insert(organizationNode, k);
                                System.out.println("organizationNode" + organizationNode);
                            }

                        }
                    }
    }
                
    private void systemJTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemJTreeMouseClicked
        populateTree();
    }//GEN-LAST:event_systemJTreeMouseClicked

    private void btnManageClinicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageClinicsActionPerformed

        ManageSatelliteClinicJPanel panel = new ManageSatelliteClinicJPanel(userProcessContainer, business, enterprise);
        userProcessContainer.add("ManageSatelliteClinicJPanel",panel);
        CardLayout layout= (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageClinicsActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed

        ManageAdminSatelliteSitesJPanel panel = new ManageAdminSatelliteSitesJPanel(userProcessContainer, enterprise, business);
        userProcessContainer.add("ManageAdminSatelliteSitesJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed

        ManageInventoryJPanel panel = new ManageInventoryJPanel(userProcessContainer,business,enterprise,userAccount);
        userProcessContainer.add("ManageInventoryJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed

    private void btnClinicRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicRequestActionPerformed

        ManageClinicRequestJPanel panel = new ManageClinicRequestJPanel(userProcessContainer, enterprise,userAccount,business);
        userProcessContainer.add("ManageRequestJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnClinicRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CreateOrderJPanel panel = new CreateOrderJPanel(userProcessContainer, enterprise, userAccount, business);
        userProcessContainer.add("CreateOrderJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        // TODO add your handling code here:
        ViewOrdersJPanel panel = new ViewOrdersJPanel(userProcessContainer, enterprise,phdEnterprise,stateNet );
        userProcessContainer.add("ViewOrdersJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClinicRequest;
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageClinics;
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameJLable;
    private javax.swing.JTree systemJTree;
    // End of variables declaration//GEN-END:variables
}
