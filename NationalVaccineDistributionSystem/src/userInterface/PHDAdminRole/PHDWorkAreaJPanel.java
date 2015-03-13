/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.PHDAdminRole;

import business.Enterprise.Enterprise;
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
public class PHDWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Business business;
    private Organization organization;
    private Network stateNet;
    private Network countryNet;

    public PHDWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount,Enterprise enterprise, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        this.enterprise=enterprise;
    
        for (Network network : business.getNetworkList()) {
            for (Network state : network.getNetWorkList()) {
                for (Enterprise e : state.getEnterpriseDirectory().getEnterpriseList()) {
                    if(e.getName().equals(enterprise.getName())){
                        System.out.println("In PHD WorkArea : enterprise assigned : " + enterprise.getName());
                        stateNet = state;
                        System.out.println("Assigning StateNet : country : " + stateNet.getCountry());
                        
                        System.out.println("Assigning StateNet.getNetWorkList : " + stateNet.getNetWorkList().size());
                            countryNet = network;
                        break;
                }
            }
        }
    }
        nameJLabel.setText("Welcome to Public Health Department, " + enterprise.getName());
                    System.out.println("countryNet" + countryNet.getRole());
    }

    private void populateTree() {

                    DefaultTreeModel dtm = (DefaultTreeModel) systemJTree.getModel();
                    ArrayList<Network> networkList = stateNet.getNetWorkList();
                    ArrayList<Enterprise> stateEnterpriseList;
                    ArrayList<Organization> organizationList = null;
                    DefaultMutableTreeNode states = new DefaultMutableTreeNode("Public Health Department");
                    DefaultMutableTreeNode root = (DefaultMutableTreeNode) dtm.getRoot();
                    root.insert(states, 0);
                    Network cityNetwork;
                    Enterprise phdEnterprise;
                    DefaultMutableTreeNode stateNode;
                    DefaultMutableTreeNode cityNode;
                    DefaultMutableTreeNode organizationNode;
                    DefaultMutableTreeNode enterpriseNode;
                    ArrayList<Network> cityNetworkList;


                    for (int l = 0; l < networkList.size(); l++) {
                        stateNet = networkList.get(l);
                        stateNode = new DefaultMutableTreeNode(stateNet.getState());
                        states.insert(stateNode, l);
                        System.out.println("stateNode" + stateNode);

                        stateEnterpriseList = stateNet.getEnterpriseDirectory().getEnterpriseList();
                        for (int j = 0; j < stateEnterpriseList.size(); j++) {
                            phdEnterprise = stateEnterpriseList.get(j);
                            enterpriseNode = new DefaultMutableTreeNode(phdEnterprise.getName());
                            stateNode.insert(enterpriseNode, j);
                        

                        cityNetworkList = stateNet.getNetWorkList();
                        for (int m = 0; m < cityNetworkList.size(); m++) {
                            cityNetwork = cityNetworkList.get(m);
                            cityNode = new DefaultMutableTreeNode(cityNetwork.getCity());
                            stateNode.insert(cityNode, m);
                            
//                            for (int k = 0; k < organizationList.size(); k++) {
//                                organization = organizationList.get(k);
//                                organizationNode = new DefaultMutableTreeNode(organization.getName());
//                                cityNode.insert(organizationNode, k);
//                                System.out.println("organizationNode" + organizationNode);
//                            }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        systemJTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        btnManageRegisteredSites = new javax.swing.JButton();
        btnProviderRequest = new javax.swing.JButton();
        btnAddAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        systemJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        systemJTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemJTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(systemJTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameJLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel2.add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 30, 550, 47));

        btnManageRegisteredSites.setText("Manage Registered Sites");
        btnManageRegisteredSites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRegisteredSitesActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageRegisteredSites, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 350, 30));

        btnProviderRequest.setText("Approve Provider Request");
        btnProviderRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProviderRequestActionPerformed(evt);
            }
        });
        jPanel2.add(btnProviderRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 350, 30));

        btnAddAdmin.setText("Manage Administrator Registered Sites");
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 350, 30));

        jButton1.setText("Add State Population");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 350, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phd.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 520, 240));

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void systemJTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemJTreeMouseClicked
        populateTree();
    }//GEN-LAST:event_systemJTreeMouseClicked

    private void btnManageRegisteredSitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRegisteredSitesActionPerformed

        AddProviderJPanel panel = new AddProviderJPanel(userProcessContainer,enterprise,stateNet);
        userProcessContainer.add("AddProviderJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageRegisteredSitesActionPerformed

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        ManageProviderAdminJPanel panel = new ManageProviderAdminJPanel(userProcessContainer, business,stateNet);
        userProcessContainer.add("ManageProviderAdminJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void btnProviderRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProviderRequestActionPerformed
        ApproveProviderRequestJPanel panel = new ApproveProviderRequestJPanel(userProcessContainer, enterprise, userAccount, business, countryNet);
        userProcessContainer.add("ApproveProviderRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProviderRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AddPopulationJPanel panel = new AddPopulationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AddPopulationJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnManageRegisteredSites;
    private javax.swing.JButton btnProviderRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTree systemJTree;
    // End of variables declaration//GEN-END:variables
}
