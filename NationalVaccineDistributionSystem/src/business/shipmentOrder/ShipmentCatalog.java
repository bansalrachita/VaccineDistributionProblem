/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.ShipmentOrder;

import business.WorkRequest.ShipmentOrder;
import java.util.ArrayList;

public class ShipmentCatalog {
     private ArrayList<ShipmentOrder> shipmentOrderList;
     
      public ShipmentCatalog() {
        
        shipmentOrderList = new ArrayList<>();
    }

    public ArrayList<ShipmentOrder> getShipmentOrderList() {
        return shipmentOrderList;
    }

    public void setShipmentOrderList(ArrayList<ShipmentOrder> shipmentOrderList) {
        this.shipmentOrderList = shipmentOrderList;
    }
      
       public void addOrder(ShipmentOrder order){
        shipmentOrderList.add(order);
    }
    
    public void removeOrder(ShipmentOrder order){
        shipmentOrderList.remove(order);
    }
}
