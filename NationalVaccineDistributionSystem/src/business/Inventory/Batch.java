/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Inventory;


public class Batch {
    private String batchNumber;
    Vaccine vaccine;
    public static int counter=1;
    private String Value;

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }
    public Batch() {
        vaccine =new Vaccine();
        Vaccine.count--;
        batchNumber= "B00"+counter;
        counter++;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
    
    
    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    
    public String toString(){
        return batchNumber;
    }
    
    
}
