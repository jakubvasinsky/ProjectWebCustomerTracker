package sk.itsovy.vasinsky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.itsovy.vasinsky.dao.CustomerDao;
import sk.itsovy.vasinsky.entity.Customer;
import sk.itsovy.vasinsky.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/list")
    public String listCustomers(Model theModel) {

        List<Customer> customers = customerService.getCustomers();

        theModel.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Model theModel){
        Customer theCustomer= new Customer();
        theModel.addAttribute("customer",theCustomer);

        return "customer-form";


    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.saveCustomer(theCustomer);

return "redirect:/customer/list";
    }

}
