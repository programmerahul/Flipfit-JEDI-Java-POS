/**
 *
 */
package com.flipfit.business;

/**
 * @author Dell
 *
 */
public interface CustomerBusiness {

    // Interface are using for declaration of the services

    public void createCustomer();
    public boolean deleteCustomer(int customerId);
    public boolean updateCustomer(int customerId);
    public void listCustomer();

}