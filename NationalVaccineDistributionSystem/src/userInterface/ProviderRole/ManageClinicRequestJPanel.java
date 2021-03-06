/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ProviderRole;

import business.Enterprise.Enterprise;
import business.Enterprise.PHDEnterprise;
import business.Enterprise.ProviderEnterprise;
import business.WorkRequest.ClinicShipmentWorkRequest;
import business.WorkRequest.WorkRequest;
import business.business.Business;
import business.network.Network;
import business.userAccounts.UserAccount;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rachita
 */
public class ManageClinicRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private ProviderEnterprise enterprise;
    private UserAccount userAccount;
    private Business business;
    private Network network;

    public ManageClinicRequestJPanel(JPanel userProcessContainer, ProviderEnterprise enterprise, UserAccount userAccount, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        for (Network country : business.getNetworkList()) {
            for (Network state : country.getNetWorkList()) {
                for (Network city : state.getNetWorkList()) {
                    for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equals(enterprise.getName())) {
                            network = state;
                            break;
                        }
                    }

                }
            }

        }
    }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProviderWorkRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("       Manage Clinic Work Request");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 440, 40));

        ProviderWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request", "Request OrderId", "Sender Organization", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(ProviderWorkRequestJTable);
        if (ProviderWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            ProviderWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            ProviderWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 1350, 330));

        btnAssign.setText("Assign To Self>>");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 220, 190, 30));

        btnProcess.setText("Process Request>>");
        btnProcess.setEnabled(false);
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 170, 190, 30));

        btnRefresh.setText("Refresh>>");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 270, 190, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = ProviderWorkRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request.");
        }

        ClinicShipmentWorkRequest request = (ClinicShipmentWorkRequest) ProviderWorkRequestJTable.getValueAt(selectedRow, 0);
        System.out.println("request : " + request.getClass());
        if(request.getReceiver()==null){
        request.setReceiver(userAccount);
        request.setStatus("InProgress");
        btnProcess.setEnabled(true);
        btnAssign.setEnabled(false);
        populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"The request has been assigned to " + request.getReceiver());
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) ProviderWorkRequestJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            if(request instanceof ClinicShipmentWorkRequest){
            ClinicShipmentWorkRequest shipmentrequest = (ClinicShipmentWorkRequest)request;
            Object[] row = new Object[6];
            row[0] = shipmentrequest;
            row[1] = shipmentrequest.getOrderRequest();
            row[2] = shipmentrequest.getOrginalClinic();
            row[3] = shipmentrequest.getSender();
            row[4] = shipmentrequest.getReceiver() == null ? null : shipmentrequest.getReceiver();
            row[5] = shipmentrequest.getStatus();
            dtm.addRow(row);
        }
        }
    }
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = ProviderWorkRequestJTable.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please select a request.");
                return;
        }
            
        ClinicShipmentWorkRequest request = (ClinicShipmentWorkRequest) ProviderWorkRequestJTable.getValueAt(selectedRow, 0);
        int ok = JOptionPane.showConfirmDialog(null, "Do you wish to accept this request?", "Approve/Reject Clinic Request", YES_NO_OPTION);
        
        if(ok==0){
           

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("Enterprise " + e.getName() + " network " + network);
            if (e instanceof PHDEnterprise) {
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                e.getWorkQueue().getWorkRequestList().add(request);
                
                request.setResolveDate(time());
                request.setSender(userAccount);
                request.setReceiver(null);
                request.setStatus("Pending with PHD");
                btnProcess.setEnabled(false);
                break;
            }
            if (request == null) {
                JOptionPane.showMessageDialog(null, "No Request exsist.");
            }

        }
        JOptionPane.showMessageDialog(null, "Request Sent to Public health Dept.");
        }
        else{
            request.setStatus("Request Rejected");
            request.setRequest("Request cannot be processed at this time. Please reach out to us at our helpline number in case of any queries.");
            JOptionPane.showMessageDialog(null,"Request has been Rejected. Clinic has been intimated.");
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProviderWorkRequestJTable;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
