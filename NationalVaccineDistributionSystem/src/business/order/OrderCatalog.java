/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.order;

import java.util.ArrayList;

public class OrderCatalog {
    
    private ArrayList<Order> orderList;

    public OrderCatalog() {
        
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
    
    public void removeOrder(Order order){
        orderList.remove(order);
    }
    
    
    
    
    
}
