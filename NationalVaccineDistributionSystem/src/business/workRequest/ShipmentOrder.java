/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.WorkRequest;

import business.Inventory.Batch;
import java.util.ArrayList;

public class ShipmentOrder extends WorkRequest{
    ArrayList<Batch> batchList;
    private String shipmentID;
    public static int count=1;
    private WorkRequest itemOrderRequest;

    

    public ArrayList<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(ArrayList<Batch> batchList) {
        this.batchList = batchList;
    }

    public ShipmentOrder() {
        batchList=new ArrayList<>();
        shipmentID=count+"";
        count++;
    }

    public WorkRequest getitemOrderRequest() {
        return itemOrderRequest;
    }

    public void setitemOrderRequest(WorkRequest request) {
        this.itemOrderRequest = request;
    }

   

    public void setShipmentID(String shipmentID) {
        this.shipmentID = shipmentID;
    }
    
    
    public String toString(){
        return this.shipmentID;
    }

    @Override
    public void setRequest(String request) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRequest() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
