/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Manufacturer;

import java.util.ArrayList;


public class ManufacturerDirectory {
    private ArrayList<Manufacturer> manufacturerList;

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }
    
    public ManufacturerDirectory(){
        manufacturerList = new ArrayList<>();
    }
    
    public Manufacturer addManufacturer(){
        Manufacturer m = new Manufacturer();
        manufacturerList.add(m);
        return m;
    }
    
    public void removeManufacturer(Manufacturer m){
        manufacturerList.remove(m);
    }
    
    public Manufacturer searchManufacturer(String Keyword){
        for(Manufacturer m: manufacturerList){
            if(Keyword.equals(super.toString())){
                return m;
            }
        }
        return null;
    }
}
