/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.enterpriseUserAccounts;

import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class UpdateAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private UserAccount user;
    public UpdateAdminJPanel(JPanel userProcessContainer,UserAccount user) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.user=user;
        txtPassword.setText(user.getPassword());
        txtUserName.setText(user.getUserName());
        txtEmployeeName.setText(user.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radActive = new javax.swing.JRadioButton();
        radInactive = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Update Admin UserAccount");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 39, 350, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        jLabel2.setText("UserName");
        jLabel2.setEnabled(false);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 20));

        txtUserName.setEnabled(false);
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 210, 30));

        jLabel5.setText("Status");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtEmployeeName.setEnabled(false);
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 210, 30));

        jLabel6.setText("Employee Name");
        jLabel6.setEnabled(false);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        buttonGroup1.add(radActive);
        radActive.setText("Active");
        add(radActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        buttonGroup1.add(radInactive);
        radInactive.setText("Inactive");
        add(radInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        btnSave.setText("Save>>");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String password = txtPassword.getText();
        Object[] status = radActive.getSelectedObjects();
        Object[] disableStatus = radInactive.getSelectedObjects();
        if(status!=null){
            user.setStatus("Active");
        }
        else if(disableStatus!=null){
            user.setStatus("Inactive");
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select status.");
            return;
        }
        user.setPassword(password);
        JOptionPane.showMessageDialog(null, "Values Updated successfully.");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       userProcessContainer.remove(this);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radActive;
    private javax.swing.JRadioButton radInactive;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
