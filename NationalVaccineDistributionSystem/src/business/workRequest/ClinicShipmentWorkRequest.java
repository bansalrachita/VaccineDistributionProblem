/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.WorkRequest;

import business.order.Order;
import business.userAccounts.UserAccount;


public class ClinicShipmentWorkRequest extends WorkRequest{
    String requirementReason;
    private Order orderRequest;
    private String orginalClinic;
    private String Orginalprovider;

    public ClinicShipmentWorkRequest() {
        orderRequest = new Order();
    }

    
    public Order getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(Order orderRequest) {
        this.orderRequest = orderRequest;
    }

    
   
    @Override
    public String getRequest() {
         return requirementReason;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRequest(String request) {
        this.requirementReason=request;
    }

    public String getOrginalClinic() {
        return orginalClinic;
    }

    public void setOrginalClinic(String orginalClinic) {
        this.orginalClinic = orginalClinic;
    }

    public String getOrginalprovider() {
        return Orginalprovider;
    }

    public void setOrginalprovider(String Orginalprovider) {
        this.Orginalprovider = Orginalprovider;
    }
    
//    public int toOrderId(){
//        return orderRequest.getOrderID();
//    }
    @Override
    public String toString() {
        return orderRequest.getClass().getSimpleName();
    }
    
    
    
    

}
