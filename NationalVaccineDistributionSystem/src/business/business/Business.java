
package business.business;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.Role;
import business.Inventory.DiseaseCatalog;
import business.Inventory.VaccineCatalog;
import business.network.Network;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.util.ArrayList;

public class Business extends Organization{
      private ArrayList<Network> networkList;
      private static Business business;
      private VaccineCatalog vaccineCatalog;
      private DiseaseCatalog diseaseCatalog;
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    
    public static Business createInstance(){
        if(business==null){
            business = new Business();
        }
    return business;   
    }
    
    Business(){
        super(null);
        networkList = new ArrayList<>();
        vaccineCatalog = new VaccineCatalog();
        diseaseCatalog=new DiseaseCatalog();
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }
    
    public Network createCountry(String name){
        Network country = new Network();
        country.setCountry(name);
        country.setRole(Network.NetworkType.Country);
        country.setCreatedTime(time());
        networkList.add(country);
        return country;
    }
   
    public Network createState(Network country, String name){
        Network state = new Network();
        state.setCountry(country.getCountry());
        state.setState(name);
        state.setRole(Network.NetworkType.State);
        state.setCreatedTime(time());
        country.getNetWorkList().add(state);
        return state;
    }   
    
    
    public Network createCity(String country, Network state,String name){
        Network city = new Network();
        city.setCountry(country);
        city.setState(state.getState());
        city.setCity(name);
        city.setRole(Network.NetworkType.City);
        city.setCreatedTime(time());
        state.getNetWorkList().add(city);
        return city;
    }  
    
    public boolean IsUniqueUser(String name){
        if(!this.getUserAccountDirectory().isUniqueUserName(name))
            return false;
        for(Network network: business.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                if(!enterprise.getUserAccountDirectory().isUniqueUserName(name))
                    return false;
                for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(!organization.getUserAccountDirectory().isUniqueUserName(name))
                        return false;
                }
            }
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    
    
    

}
