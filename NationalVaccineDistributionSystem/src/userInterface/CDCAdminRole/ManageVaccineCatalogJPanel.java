/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.CDCAdminRole;

import business.Enterprise.CDCEnterprise;
import business.Enterprise.Enterprise;
import business.Inventory.Vaccine;
import business.business.Business;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rachita
 */
public class ManageVaccineCatalogJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Business business;
    private Enterprise enterprise;
    private CDCEnterprise cDCEnterprise;
    public ManageVaccineCatalogJPanel(JPanel userProcessContainer,Business business,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.business=business;
        cDCEnterprise=(CDCEnterprise) enterprise;
        nameJLable.setText(enterprise.getName());
        populateCmbVaccine();
        populateVaccine();
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
        nameJLable = new javax.swing.JLabel();
        btnAddingVaccine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineCatalogJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        batchSize = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        VaccineJTable1 = new javax.swing.JTable();
        vaccine_n = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDeletingVaccine = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Add Vaccine Catalog for >>");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 320, 40));

        nameJLable.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        add(nameJLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 150, 40));

        btnAddingVaccine.setText("Add Vaccine >>");
        btnAddingVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddingVaccineActionPerformed(evt);
            }
        });
        add(btnAddingVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 130, 30));

        VaccineCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VaccineID", "VacccineName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaccineCatalogJTable);
        if (VaccineCatalogJTable.getColumnModel().getColumnCount() > 0) {
            VaccineCatalogJTable.getColumnModel().getColumn(0).setResizable(false);
            VaccineCatalogJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 240, 120));

        jLabel4.setText("View Vaccines");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 100, 20));

        btnView.setText("View Vaccine");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 100, 30));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 80, 30));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 130, 30));

        jLabel5.setText("Price Approx.");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabel6.setText("Standard Inventory Batch");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, 20));

        batchSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchSizeActionPerformed(evt);
            }
        });
        add(batchSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 130, 30));

        VaccineJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Stock", "CreatedTime", "Standard Inventory Batch", "Vaccine#Batch"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(VaccineJTable1);
        if (VaccineJTable1.getColumnModel().getColumnCount() > 0) {
            VaccineJTable1.getColumnModel().getColumn(0).setResizable(false);
            VaccineJTable1.getColumnModel().getColumn(1).setResizable(false);
            VaccineJTable1.getColumnModel().getColumn(2).setResizable(false);
            VaccineJTable1.getColumnModel().getColumn(3).setResizable(false);
            VaccineJTable1.getColumnModel().getColumn(4).setResizable(false);
            VaccineJTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 780, 190));

        vaccine_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccine_nActionPerformed(evt);
            }
        });
        add(vaccine_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 130, 30));

        jLabel7.setText("Number of Vaccines in Batch ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        btnDeletingVaccine.setText("<< Delete Vaccine");
        btnDeletingVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletingVaccineActionPerformed(evt);
            }
        });
        add(btnDeletingVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void populateCmbVaccine(){
//        cmbName.removeAllItems();
//        for(Vaccine v:business.getVaccineCatalog().getVaccineList()){
//            
//            System.out.println("Adding V in cmbName : " + cmbName);
//            cmbName.addItem(v.getName());
//        }
    }
    private void populateVaccine(){
       // Vaccine vac = (Vaccine) VaccineCatalogJTable.getSelectedItem();
        
        DefaultTableModel dtm = (DefaultTableModel) VaccineCatalogJTable.getModel();
        dtm.setRowCount(0);
//        System.out.println("VACC{0]" + cDCEnterprise.getVaccineCatalog1().getVaccineList().get(0));
        for(Vaccine v:business.getVaccineCatalog().getVaccineList()){
                System.out.println("Adding for V :" + v);
                Object row[] = new Object[2];
                row[0] = v;
                row[1] = v.getName();
                dtm.addRow(row);
                
            
        }
    }
    private void btnAddingVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddingVaccineActionPerformed
 
        int selectedRow = VaccineCatalogJTable.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row.");
        }
        else{
            
        
        boolean flag=false;
        try{
        //Vaccine vac = (Vaccine) cmbName.getSelectedItem();
            Vaccine vac = (Vaccine) VaccineCatalogJTable.getValueAt(selectedRow, 0);
        for(Vaccine v: cDCEnterprise.getVaccineCatalog1().getVaccineList()){
            if(v.getName().equals(vac.getName())){
                JOptionPane.showMessageDialog(null,"Vaccine is already created.");
                flag=true;
                return;
            }
        }
            System.out.println("Vaccine is not created : ");
        if(!flag){
            for(Vaccine vaccine : business.getVaccineCatalog().getVaccineList()){
                if(vaccine.getName().equals(vac.getName())){
                    Vaccine newVaccine = new Vaccine();
                    Vaccine.count--;
                    //batchSize.setText(vaccine.getName());
                    System.out.println("vaccine_n  for Vaccine: "+ vaccine_n.getText());
                    System.out.println("batchSize  for Vaccine: " + batchSize.getText());
                    newVaccine.setPrice(Integer.parseInt(txtPrice.getText()));
                    newVaccine.setCode(vaccine.getCode());
                    newVaccine.setName(vaccine.getName());
                    newVaccine.setDateCreated(time());
                    newVaccine.setLastUpdated(time());
                    newVaccine.setStock(vaccine.getStock());
                    newVaccine.setFixedQty(Integer.parseInt(batchSize.getText()));
                    newVaccine.setQuantity(Integer.parseInt(vaccine_n.getText()));
                    cDCEnterprise.getVaccineCatalog1().getVaccineList().add(newVaccine);
                    JOptionPane.showMessageDialog(null,"Vaccine added successfully.");
                    populateTable();
                }
            
            
        }

            
        }
        }
        
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, " Enter valid values");
                    e.printStackTrace();
                    return;
                    }
                    
        } 
    }//GEN-LAST:event_btnAddingVaccineActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        populateTable();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void batchSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchSizeActionPerformed

    private void vaccine_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccine_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccine_nActionPerformed

    private void btnDeletingVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletingVaccineActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = VaccineCatalogJTable.getSelectedRow();
        System.out.println("delete row number : " + selectedRow);
        int counter = 0 ;
        System.out.println("before removing row number : " + selectedRow);
        System.out.println("before Business size: " + business.getVaccineCatalog().getVaccineList().size());
       for(Vaccine vaccine : business.getVaccineCatalog().getVaccineList())           
           System.out.println("vaccine : " + vaccine + " " + vaccine.getName() + counter ++);
        
       business.getVaccineCatalog().getVaccineList().remove(selectedRow);
        System.out.println("after Business size: " + business.getVaccineCatalog().getVaccineList().size());
       System.out.println("after removing row number : " + selectedRow);
        
       for(Vaccine vaccine : business.getVaccineCatalog().getVaccineList())           
           System.out.println("vaccine : " + vaccine + " " + vaccine.getName() + counter ++);
       populateVaccine();

    }//GEN-LAST:event_btnDeletingVaccineActionPerformed

    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) VaccineJTable1.getModel();
        dtm.setRowCount(0);
        System.out.println("in populate Table" + cDCEnterprise.getVaccineCatalog1().getVaccineList().size());
        for(Vaccine vaccine:cDCEnterprise.getVaccineCatalog1().getVaccineList()){
            System.out.println("Adding in populate table " + vaccine);
            Object[] row = new Object[6];
            row[0] = vaccine;
            row[1] = vaccine.getName();
            row[2] = vaccine.getStock();
            row[3] = vaccine.getDateCreated();
            row[4] = vaccine.getFixedQty();
            row[5] = vaccine.getQuantity();
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VaccineCatalogJTable;
    private javax.swing.JTable VaccineJTable1;
    private javax.swing.JTextField batchSize;
    private javax.swing.JButton btnAddingVaccine;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeletingVaccine;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameJLable;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField vaccine_n;
    // End of variables declaration//GEN-END:variables
}
