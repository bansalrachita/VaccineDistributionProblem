/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Inventory;


public class Vaccine {
    private String code;
    public static int count = 1;
    private String name;
    private String dateCreated;
    private String lastUpdated;
    private Type stock;
    private int quantity;
    private int price;
    private int fixedQty;
    
    public Vaccine(){
        code = "V00"+count;
        count++;
    }

    public int getFixedQty() {
        return fixedQty;
    }

    public void setFixedQty(int fixedQty) {
        this.fixedQty = fixedQty;
    }

    
    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public enum Type{
       InStock("In Stock"){
       }, OutOfStock("Out of Stock"){
       },Banned("Banned"){
       };
       private String value;
    
    private Type(String value){
        this.value = value;
        
    }

        public String getValue() {
            return value;
        }
    }

    public Type getStock() {
        return stock;
    }

    public void setStock(Type stock) {
        this.stock = stock;
    }
    
    public String toString(){
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public boolean isInStock(Vaccine v){
        boolean flag=false;
        if(v.getStock().getValue().equals(Type.InStock.getValue())){
            flag = true;
        }
        return flag;
    }
    
    
}