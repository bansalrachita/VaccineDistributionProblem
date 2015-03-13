/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Inventory;

import java.util.ArrayList;


public class DiseaseCatalog {
    private ArrayList<Disease> diseaseList;

    public DiseaseCatalog() {
        diseaseList=new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }
    
    public Disease createNewDisease(){
        Disease disease = new Disease();
        diseaseList.add(disease);
        return disease;
    }
}
