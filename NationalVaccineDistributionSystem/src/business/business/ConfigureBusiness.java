
package business.business;

import business.Employee.Employee;
import business.Role.SystemAdminRole;
import business.network.Network;
import business.userAccounts.UserAccount;


public class ConfigureBusiness{
    
    public static Business configure(){
    Business business = Business.createInstance();
    Employee employee = business.getEmployeeDirectory().createEmployee("Rachita Bansal");
//    Enterprise e = new Enterprise(Organization.Type.SystemAdmin.getValue());
//    e.getOrganizationDirectory().createOrganization(Organization.Type.SystemAdmin);
    //Network network = business.createCountry("UN");
    UserAccount user = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole(),employee);
    
    return business;
    }
    
}
