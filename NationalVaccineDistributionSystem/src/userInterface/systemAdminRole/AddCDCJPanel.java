/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.systemAdminRole;

import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.business.Business;
import business.network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class AddCDCJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCDCJPanel
     */
    JPanel userProcessContainer;
    private Network network;
    private Business business;
    
    public AddCDCJPanel(JPanel userProcessContainer,Business business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network=network;
        this.business=business;
        countryJlabel.setText(network.getCountry());
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
        countryJlabel = new javax.swing.JLabel();
        txtCDCName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Add Center of Disease Control for >> ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 41, -1, 30));

        countryJlabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        add(countryJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 116, 30));
        add(txtCDCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 30));

        btnAdd.setText("Add>>");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 90, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtCDCName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a valid name");
            return;
        }
        for(Network countryNetwork: business.getNetworkList()){
            if(countryNetwork.getCountry().equals(network.getCountry())){
                if(countryNetwork.getEnterpriseDirectory().getEnterpriseList().isEmpty()){
                EnterpriseDirectory enterpriseDirectory = countryNetwork.getEnterpriseDirectory();
                enterpriseDirectory.createAndAddEnterprise(txtCDCName.getText(), Enterprise.EnterpriseType.CDC);
                JOptionPane.showMessageDialog(null,"CDC Added successfully");
                txtCDCName.setEnabled(false);
                btnAdd.setEnabled(false);
                return;
                }
                else{
                    JOptionPane.showMessageDialog(null,"CDC already created");
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel countryJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCDCName;
    // End of variables declaration//GEN-END:variables
}
