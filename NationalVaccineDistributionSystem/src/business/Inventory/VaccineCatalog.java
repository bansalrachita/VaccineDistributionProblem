/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Inventory;

import java.util.ArrayList;

public class VaccineCatalog {
    private ArrayList<Vaccine> vaccineList;

    public VaccineCatalog() {
        vaccineList=new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
    public Vaccine createVaccine(String name){
        Vaccine vaccine = new Vaccine();
        vaccineList.add(vaccine);
        vaccine.setName(name);
        return vaccine;
    }
    
    
    
}
