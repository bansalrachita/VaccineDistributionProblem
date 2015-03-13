/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.WorkRequest;

import business.order.Order;


public class ProviderWorkRequest extends WorkRequest{

    private String rejectReason;
    private Order orderRequest;
    private String Orginalprovider;

    public ProviderWorkRequest() {
        orderRequest=new Order();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Order getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(Order orderRequest) {
        this.orderRequest = orderRequest;
    }

    public String getOrginalprovider() {
        return Orginalprovider;
    }

    public void setOrginalprovider(String Orginalprovider) {
        this.Orginalprovider = Orginalprovider;
    }
    
    
    @Override
    public void setRequest(String request) {
        
         this.rejectReason=request;
    }

    @Override
    public String getRequest() {
        return rejectReason;
    }
    
    @Override
    public String toString() {
        return orderRequest.getClass().getSimpleName();
    }
    
}
