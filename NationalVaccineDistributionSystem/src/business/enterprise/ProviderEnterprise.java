/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Enterprise;

import business.Inventory.Inventory;
import business.order.OrderCatalog;
import business.Role.ProviderRole;
import business.Role.Role;
import java.util.ArrayList;

public class ProviderEnterprise extends Enterprise{

    private Inventory providerInventory;
    private OrderCatalog orderCatalog;
    
    public ProviderEnterprise(String name) {
        super(name);
        providerInventory = new Inventory();
        orderCatalog=new OrderCatalog();
    }

    public Inventory getProviderInventory() {
        return providerInventory;
    }

    public void setProviderInventory(Inventory providerInventory) {
        this.providerInventory = providerInventory;
    }

    public OrderCatalog getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(OrderCatalog orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
