/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.systemAdminRole;

import business.business.Business;
import business.network.Network;
import java.awt.CardLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rachita
 */
public class AddNewNetworkJPanel extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form AddNewNetworkJPanel
     */
    JPanel userProcessContainer;
    private Business business;
    boolean flag1;
    boolean flag2;
    boolean flag3;
    boolean flag;

    List<String> citiesMA = new ArrayList<>();
    List<String> citiesTX = new ArrayList<>();
    List<String> citiesMH = new ArrayList<>();
    List<String> citiesKN = new ArrayList<>();
    List<String> citiesGoa = new ArrayList<>();
    List<String> citiesTamilNadu = new ArrayList<>();
    List<String> citiesChengdu = new ArrayList<>();
    List<String> citiesBeijing = new ArrayList<>();
    List<String> citiesBahia = new ArrayList<>();
    List<String> citiesSaoPaulo = new ArrayList<>();
    List<String> citiesAbakan = new ArrayList<>();
    List<String> citiesBaley = new ArrayList<>();

    Map<String, List<String>> states_us = new HashMap<>();
    Map<String, List<String>> states_ind = new HashMap<>();
    Map<String, List<String>> states_china = new HashMap<>();
    Map<String, List<String>> states_brazil = new HashMap<>();
    Map<String, List<String>> states_russia = new HashMap<>();
    
    

    Map<String, Map<String, List<String>>> countries = new HashMap<>();

    public AddNewNetworkJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;

        citiesMA.add("Boston");
        citiesMA.add("Salem");
        citiesMA.add("Cambridge");

        citiesTX.add("Dallas");
        citiesTX.add("Arlington");

        citiesMH.add("Vashi");
        citiesMH.add("Mumbai");
        citiesMH.add("Pune");

        citiesKN.add("Mysore");
        citiesKN.add("Banglore");
        
        citiesGoa.add("Panaji");
        
        citiesTamilNadu.add("Chennai");
        citiesTamilNadu.add("Ooty");

        citiesChengdu.add("Sichuan");
        citiesBeijing.add("Beijing");
        
        citiesBahia.add("Itatim");
        citiesBahia.add("Boquira");
        
        citiesSaoPaulo.add("Andradina");
        citiesSaoPaulo.add("Araraquara");
        
        citiesAbakan.add("Yenisei");
        citiesAbakan.add("Abakan");
        
        citiesBaley.add("Krai");
        
        states_us.put("MA", citiesMA);
        states_us.put("TX", citiesTX);

        states_ind.put("MH", citiesMH);
        states_ind.put("KN", citiesKN);
        states_ind.put("GOA", citiesGoa);
        states_ind.put("TN", citiesTamilNadu);

        states_china.put("Sichuan",citiesChengdu);
        states_china.put("Beijing",citiesBeijing);
        
        states_brazil.put("Bahia",citiesBahia);
        states_brazil.put("SaoPaulo",citiesSaoPaulo);
        
        states_russia.put("Abakan", citiesAbakan);
        states_russia.put("Baley", citiesBaley);
        
        
        countries.put("USA", states_us);
        countries.put("INDIA", states_ind);
        countries.put("CHINA", states_china);
        countries.put("BRAZIL", states_brazil);
        countries.put("RUSSIA", states_russia);

        populateCountryNetwork();
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
        jLabel3 = new javax.swing.JLabel();
        cmbCountry = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox();
        btnCountry = new javax.swing.JButton();
        btnState = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Add New Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 45, 325, 45));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 30));

        jLabel3.setText("Select a country network -->");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 20));

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Country", " " }));
        cmbCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCountryMouseClicked(evt);
            }
        });
        add(cmbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 270, 30));

        jLabel4.setText("Select a state network -->");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, 20));

        cmbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "State " }));
        cmbState.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbStateMouseClicked(evt);
            }
        });
        cmbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateActionPerformed(evt);
            }
        });
        add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, 30));

        jLabel5.setText("Select a city network --> ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 130, -1));

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "City" }));
        add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 270, 30));

        btnCountry.setText("Add>>");
        btnCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountryActionPerformed(evt);
            }
        });
        add(btnCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        btnState.setText("Add>>");
        btnState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateActionPerformed(evt);
            }
        });
        add(btnState, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        btnCity.setText("Add>>");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });
        add(btnCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        btnReset.setText("Reset>>");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public void populateCountryNetwork() {
        cmbCountry.removeAllItems();
        for (Map.Entry<String, Map<String, List<String>>> entry_countries : countries.entrySet()) {
            cmbCountry.addItem(entry_countries.getKey());
        }
        
         cmbCountry.addActionListener(new ActionListener() {

           @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calling Action Listener ");
                         String state = (String) cmbCountry.getSelectedItem();
        System.out.println("get selected item : " + state);
        if (state != null) {
        populateStateNetwork();
         }
    }
        });
    }

    public void populateStateNetwork() {
        cmbState.removeAllItems();
        for (Map.Entry<String, Map<String, List<String>>> entry_countries : countries.entrySet()) {
            String selectedItem = (String) cmbCountry.getSelectedItem();
            if (entry_countries.getKey().equals(selectedItem) && selectedItem != null) {
                for (Map.Entry<String, List<String>> entry_states : entry_countries.getValue().entrySet()) {
                    cmbState.addItem(entry_states.getKey());
                }
            }
        }
        
        cmbState.addActionListener(new ActionListener() {

           @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calling Action Listener ");
                         String state = (String) cmbState.getSelectedItem();
        System.out.println("get selected item : " + state);
        if (state != null) {
        populateCityNetwork();
         }
    }
        });
                }

    public void populateCityNetwork() {
        cmbCity.removeAllItems();
        String selectedItem = (String) cmbState.getSelectedItem();
        for (Map.Entry<String, Map<String, List<String>>> entry_countries : countries.entrySet()) {
            for (Map.Entry<String, List<String>> entry_states : entry_countries.getValue().entrySet()) {
                if (entry_states.getKey().equals(selectedItem) && selectedItem != null) {
                    for (String city_name : entry_states.getValue()) {
                        cmbCity.addItem(city_name);
                    }
                }
            }
        }
    }
        
    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed

    }//GEN-LAST:event_cmbStateActionPerformed


    private void cmbCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCountryMouseClicked
        populateStateNetwork();
    }//GEN-LAST:event_cmbCountryMouseClicked

    private void cmbStateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbStateMouseClicked
        populateCityNetwork();
    }//GEN-LAST:event_cmbStateMouseClicked

    private void btnCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountryActionPerformed

        String country = (String) cmbCountry.getSelectedItem();
        if (country == null) {
            JOptionPane.showMessageDialog(null, "Please select a Country and try again.");

        } else {
            for (Network network : business.getNetworkList()) {
                if (network.getCountry().equals(country)) {
                    JOptionPane.showMessageDialog(null, "This network already exists.");

                    return;
                }
            }
            try {
                int ok = 0;
                ok = JOptionPane.showConfirmDialog(null, "You cannot delete the network. Are you sure you want to proceed?");
                if (ok == 0) {
                    business.createCountry(country);

                    JOptionPane.showMessageDialog(null, "Network Added successfully");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "There was error adding the network.");

            }

        }


    }//GEN-LAST:event_btnCountryActionPerformed

    private void btnStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateActionPerformed
       String country = (String) cmbCountry.getSelectedItem();
            String state = (String) cmbState.getSelectedItem();
            if (state == null) {
                JOptionPane.showMessageDialog(null, "Please select a state.");
               
            } else {

                for (Network countryNetwork : business.getNetworkList()) {
                    if (countryNetwork.getCountry().equals(country)) {
                        flag = true;
                    }
                }
                if(!flag){
                    JOptionPane.showMessageDialog(null,"Please create a network at country level to proceed");
                    
                    return;
                }

                for (Network network : business.getNetworkList()) {
                    System.out.println("network.getCountry()" + network.getCountry() + "country" + (country));
                    if (network.getCountry().equals(country)) {
                        for (Network stateNetwork : network.getNetWorkList()) {
                            System.out.println("stateNetwork.getState()" + stateNetwork.getState() + "stateNetwork.getCountry()" + stateNetwork.getCountry() + "stateNetwork.getRole()" + stateNetwork.getRole());
                            if (stateNetwork.getState().equals(state) && stateNetwork.getCountry().equals(country) && stateNetwork.getRole().equals(Network.NetworkType.State)) {
                                JOptionPane.showMessageDialog(null, "This network already exists");
                               
                                return;
                            }
      
                        }
                             
                       
                        business.createState(network, state);
                       
                        JOptionPane.showMessageDialog(null, "Network Added successfully");
                                    
                        
                    }

                }
            }

        


    }//GEN-LAST:event_btnStateActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed

        String country = (String) cmbCountry.getSelectedItem();
        String state = (String) cmbState.getSelectedItem();
        String city = (String) cmbCity.getSelectedItem();

        if (state == null || city == null || country == null) {
            JOptionPane.showMessageDialog(null, "Please select a network.");

        } else {

            for (Network network : business.getNetworkList()) {
                if (network.getCountry().equals(country)) {
                    flag1 = true;
                    for (Network stateNetwork : network.getNetWorkList()) {
                        if (stateNetwork.getState().equals(state) && stateNetwork.getCountry().equals(country)) {
                            flag2 = true;
                            for (Network cityNetwork : stateNetwork.getNetWorkList()) {
                                if (cityNetwork.getState().equals(state) && cityNetwork.getCity().equals(city) && cityNetwork.getCountry().equals(country)) {
                                    flag3 = true;

                                    JOptionPane.showMessageDialog(null, "You are trying to create already existing network");
                                    return;
                                }

                            }
                            if (flag1 && flag2 && !flag3) {

                                business.createCity(country, stateNetwork, city);
                                JOptionPane.showMessageDialog(null, "Network Added successfully");
                                return;

                            }

                        }

                    }
                }

            }

            if (flag2 == false && flag3 == false) {
                JOptionPane.showMessageDialog(null, "Please create country/state level Network");

                return;
            }

        }
    
    }//GEN-LAST:event_btnCityActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        
         flag1=false;
     flag2=false;
     flag3=false;
    flag=false;
        
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnCountry;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnState;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbCountry;
    private javax.swing.JComboBox cmbState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

     @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

