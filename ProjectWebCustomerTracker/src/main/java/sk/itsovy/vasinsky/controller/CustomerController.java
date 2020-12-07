package sk.itsovy.vasinsky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.itsovy.vasinsky.dao.CustomerDao;
import sk.itsovy.vasinsky.entity.Customer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/list")
    public String listCustomers(Model theModel) {

        List<Customer> customers = customerDao.getCustomers();

        theModel.addAttribute("customers", customers);

        return "list-customers";
    }

}
