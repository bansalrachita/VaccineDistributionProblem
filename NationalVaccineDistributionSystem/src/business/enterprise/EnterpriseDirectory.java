/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package business.Enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {
   private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
   
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type)
    {
    Enterprise enterprise= null;
    
    if(type==Enterprise.EnterpriseType.CDC){
    enterprise= new CDCEnterprise(name);
    enterpriseList.add(enterprise);
    enterprise.setEnterpriseType(type);
    }
    
    if(type==Enterprise.EnterpriseType.PHD){
        enterprise=new PHDEnterprise(name);
        enterpriseList.add(enterprise);
        enterprise.setEnterpriseType(type);
    }
    
    if(type==Enterprise.EnterpriseType.Provider){
        enterprise=new ProviderEnterprise(name);
        enterpriseList.add(enterprise);
        enterprise.setEnterpriseType(type);
    }
    return enterprise;
    }
    
   
}
