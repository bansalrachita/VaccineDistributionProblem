/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.ClinicRole;

import java.util.ArrayList;

public class ClinicDirectory {
    private ArrayList<Clinic> ClinicList;

    public ClinicDirectory() {
        ClinicList=new ArrayList<>();
    }

    public ArrayList<Clinic> getClinicList() {
        return ClinicList;
    }

    public void setClinicList(ArrayList<Clinic> ClinicList) {
        this.ClinicList = ClinicList;
    }

   
    
    public Clinic addClinic(){
        Clinic p = new Clinic();
        ClinicList.add(p);
        return p;
    }
    
     public void removeClinic(Clinic p){
        ClinicList.remove(p);
    }
    
    public Clinic searchProvider(String Keyword){
        for(Clinic p: ClinicList){
            if(Keyword.equals(super.toString())){
                return p;
            }
        }
        return null;
    }
    
}
