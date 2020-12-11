package sk.itsovy.vasinsky.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.itsovy.vasinsky.dao.CustomerDao;
import sk.itsovy.vasinsky.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
    customerDao.saveCustomer(theCustomer);
    }
}
