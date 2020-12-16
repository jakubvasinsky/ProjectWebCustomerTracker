package sk.itsovy.vasinsky.service;

import sk.itsovy.vasinsky.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
