/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.ProviderRole;

import business.Enterprise.ProviderEnterprise;
import business.Inventory.Batch;
import business.business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rachita
 */
public class ViewProviderInventoryJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Business business;
    private ProviderEnterprise enterprise;
    private int totalInventory;
    
    public ViewProviderInventoryJPanel(JPanel userProcessContainer,Business business,ProviderEnterprise enterprise) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.enterprise=enterprise;
        populateTable();
        txtTotalQuantity.setText(totalInventory+"");
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) VaacineJTable.getModel();
        dtm.setRowCount(0);
        for(Batch b: enterprise.getProviderInventory().getBatchList()){
            Object[] row = new Object[5];
            row[0] = b.getBatchNumber();
            row[1] = b.getVaccine().getCode();
            row[2] = b.getVaccine().getName();
            row[3] = b.getVaccine().getQuantity();
            row[4] = b.getVaccine().getStock();
            dtm.addRow(row);
            totalInventory = b.getVaccine().getQuantity() + totalInventory;
            enterprise.getProviderInventory().setTotalQuantity(totalInventory);
            
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VaacineJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotalQuantity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("View Provider Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 523, 37));

        VaacineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch Number", "Vaccine Code", "Vaccine Name", "Vaccine Quantity", "Stock Info"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaacineJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 660, 210));

        jLabel2.setText("Total Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        txtTotalQuantity.setEnabled(false);
        add(txtTotalQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 180, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VaacineJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTotalQuantity;
    // End of variables declaration//GEN-END:variables
}
