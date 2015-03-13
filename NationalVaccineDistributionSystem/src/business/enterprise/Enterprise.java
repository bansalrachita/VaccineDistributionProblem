/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rachita
 */

package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.WorkRequest.WorkQueue;

public abstract class Enterprise extends Organization {

    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    private WorkQueue workQueue;

    public Enterprise(String name) {
        super(name);
        organizationDirectory = new OrganizationDirectory();
        workQueue = new WorkQueue();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {

        CDC("Center of Disease Control") {
                }, PHD("Public Health Department") {
                }, Provider("Provider") {
                };

        private String value;

        private EnterpriseType(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String toString() {
        return this.getName();
    }

}
