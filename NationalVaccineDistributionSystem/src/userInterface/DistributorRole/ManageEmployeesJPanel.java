/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DistributorRole;

import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.DistributorRole;
import business.Role.EmployeeRole;
import business.business.Business;
import business.network.Network;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rachita
 */
public class ManageEmployeesJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Organization organization;
    private UserAccount user;
    
    public ManageEmployeesJPanel(JPanel userProcessContainer,
            Business business,
            Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.business = business;
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeJTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        warningJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Manage Employees Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 620, 40));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        EmployeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Password", "EmployeeID", "EmployeeName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmployeeJTable);
        if (EmployeeJTable.getColumnModel().getColumnCount() > 0) {
            EmployeeJTable.getColumnModel().getColumn(0).setResizable(false);
            EmployeeJTable.getColumnModel().getColumn(1).setResizable(false);
            EmployeeJTable.getColumnModel().getColumn(2).setResizable(false);
            EmployeeJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 640, 120));

        btnAdd.setText("Add>> ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 80, 30));

        jLabel2.setText("Name:  ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, 30));

        btnRefresh.setText("Refresh>>  ");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jLabel4.setText("UserName: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setText("Password:  ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 150, 30));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, 30));

        warningJLabel.setForeground(new java.awt.Color(255, 0, 51));
        add(warningJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         boolean flag=true;
         try{
        String name = txtUserName.getText();
            String password = txtPassword.getText();
            String EmpName = txtName.getText();
            Employee employee = organization.getEmployeeDirectory().createEmployee(EmpName);
            for(Network network: business.getNetworkList()){
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                        //System.out.println("user" + user + "e" + e.getName());
                        if(!e.getUserAccountDirectory().isUniqueUserName(name)){
                            //System.out.println("flag" + flag + user + user);
                            flag=false;
                            break;
                        }
                        
                if(flag){
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                        if(!o.getUserAccountDirectory().isUniqueUserName(name)){
                            flag=false;
                            break;
                        }
                        for(Network state: network.getNetWorkList()){
                            for(Enterprise e1: state.getEnterpriseDirectory().getEnterpriseList()){
                                if(!e1.getUserAccountDirectory().isUniqueUserName(name)){
                                    flag=false;
                                    break;
                                }
                                
                                if(flag){
                                    for(Organization o1: e1.getOrganizationDirectory().getOrganizationList()){
                                        if(!o1.getUserAccountDirectory().isUniqueUserName(name)){
                                            flag=false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
            //System.out.println("flag " + flag);
            if(flag){
                if(name.equals("") || password.equals("") || EmpName.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter valid values");
                    return;
                }
                
                if(organization.getType().equals(Organization.Type.Distributor)){
                user = organization.getUserAccountDirectory().createUserAccount(name, password, new EmployeeRole(), employee);   
                JOptionPane.showMessageDialog(null, "Admin added successfully.");
                txtName.setEnabled(false);
                txtPassword.setEnabled(false);
                txtUserName.setEnabled(false);
                btnAdd.setEnabled(false);
                populateTable();
                }
            }
             else{
                warningJLabel.setEnabled(true);
                warningJLabel.setText("**UserName should be unique.");
            }
        }
        
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null,"Account cannot be added.");
            organization.getUserAccountDirectory().removeUser(user);
        
        }
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) EmployeeJTable.getModel();
        dtm.setRowCount(0);
        for(UserAccount user: organization.getUserAccountDirectory().getUserAccountList()){
            Object[] row= new Object[4];
            row[0]=user;
            row[1]=user.getPassword();
            row[2]=user.getEmployee().getEmpID();
            row[3]=user.getEmployee().getName();
            dtm.addRow(row);
        }
    }
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeJTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel warningJLabel;
    // End of variables declaration//GEN-END:variables
}
