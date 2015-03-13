/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.systemAdminRole;

import business.Inventory.Vaccine;
import business.Inventory.VaccineCatalog;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class UpdateStockJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateStockJPanel
     */
    JPanel userProcessContainer;
    private VaccineCatalog vaccineCatalog;
    private Vaccine vaccine;
    
    public UpdateStockJPanel(JPanel userProcessContainer,Vaccine vaccine) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vaccine=vaccine;
        txtCode.setText(vaccine.getCode());
        txtName.setText(vaccine.getName());
        txtStock.setText(vaccine.getStock().getValue());
        txtLastUpdated.setText(vaccine.getLastUpdated());
        populateCmbStock();

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
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLastUpdated = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdatedVaccine = new javax.swing.JButton();
        cmbStockInfo = new javax.swing.JComboBox();
        txtStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Update StockPile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 41, 232, 35));

        txtName.setEnabled(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 210, 30));

        jLabel2.setText("Vaccine Name ");
        jLabel2.setEnabled(false);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 80, 20));

        jLabel3.setText("Vaccine Code");
        jLabel3.setEnabled(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 70, -1));

        txtCode.setEnabled(false);
        add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 90, 30));

        jLabel5.setText("Stock Information");
        jLabel5.setEnabled(false);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel6.setText("Last Updated ");
        jLabel6.setEnabled(false);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        txtLastUpdated.setEnabled(false);
        add(txtLastUpdated, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 210, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 30));

        btnUpdatedVaccine.setText("Update Vaccine>>");
        btnUpdatedVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatedVaccineActionPerformed(evt);
            }
        });
        add(btnUpdatedVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 130, 30));

        add(cmbStockInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 210, 30));

        txtStock.setEnabled(false);
        add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 210, 30));

        jLabel4.setText("New Stock Value");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateCmbStock(){
        cmbStockInfo.removeAllItems();;
        for(Vaccine.Type type: Vaccine.Type.values()){
            cmbStockInfo.addItem(type);
        }
    }
    private void btnUpdatedVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatedVaccineActionPerformed
        try{
            Vaccine.Type type = (Vaccine.Type) cmbStockInfo.getSelectedItem();
            vaccine.setStock(type);
            JOptionPane.showMessageDialog(null,"Information updated successfully.");
            btnUpdatedVaccine.setEnabled(false);
            cmbStockInfo.setEnabled(false);
            vaccine.setLastUpdated(time());
            return;
        
        
    }
    catch(Exception e){
       JOptionPane.showMessageDialog(null, "Info could not be updated");
       return;
    }
    }//GEN-LAST:event_btnUpdatedVaccineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdatedVaccine;
    private javax.swing.JComboBox cmbStockInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtLastUpdated;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
