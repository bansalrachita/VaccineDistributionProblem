/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.order;

import business.Inventory.Vaccine;

public class OrderItem {
    private Vaccine vaccine;
    private int quantity;
    private String daysOfOrderPlaced;
    private float price;
    private Type type;

    public OrderItem(Vaccine vaccine, int quantity, String daysOfOrderPlaced, float price) {
        this.vaccine = vaccine;
        this.quantity = quantity;
        this.daysOfOrderPlaced = daysOfOrderPlaced;
        this.price = price;
    }

    
    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDaysOfOrderPlaced() {
        return daysOfOrderPlaced;
    }

    public void setDaysOfOrderPlaced(String daysOfOrderPlaced) {
        this.daysOfOrderPlaced = daysOfOrderPlaced;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
     public String toString(){
         return vaccine.getName();
     }
     
      public enum Type{
             
         Biweekly("Bi-Weekly"){
            
        }, Monthly("Monthly"){
            
        };
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
}
    
    
}
