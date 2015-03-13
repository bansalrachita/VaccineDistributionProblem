/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.network;

import business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;
import java.util.Date;

public class Network {
    private ArrayList<Network> netWorkList;
    private String country;
    private String state;
    private String city;
    private NetworkType role;
    private String createdTime;
    private EnterpriseDirectory enterpriseDirectory;
    
    public enum NetworkType{
        Country("Country"),
        State("State"),
        City("City");
        
        private String value;
        private NetworkType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        @Override
        public String toString() {
            return value;
        }
    }
    
    public Network() {
        netWorkList = new ArrayList<>();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getCountry() {
        return country;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public NetworkType getRole() {
        return role;
    }

    public void setRole(NetworkType role) {
        this.role = role;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
         return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public ArrayList<Network> getNetWorkList() {
        return netWorkList;
    }   
    
    public String toString(){
        return this.country; 
    }
    
}
