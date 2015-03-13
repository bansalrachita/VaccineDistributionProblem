/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Inventory;

import java.util.ArrayList;


public class Inventory {
    ArrayList<Batch> batchList;
    private int totalQuantity ;
    

    public Inventory() {
        batchList=new ArrayList<>();
    }

    public ArrayList<Batch> getBatchList() {
        return batchList;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public void setBatchList(ArrayList<Batch> batchList) {
        this.batchList = batchList;
    }
    
    public Batch addBatch(){
        Batch batch=new Batch();
        batchList.add(batch);
        return batch;
    }
    
    
}
