/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.WorkRequest;

import business.Inventory.Vaccine;

public class DistributorRequest extends WorkRequest{

    private Vaccine vaccine;
    private String action;

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    
    @Override
    public void setRequest(String request) {
       this.action=request;
    }

    @Override
    public String getRequest() {
        return action;
    }
    
}
