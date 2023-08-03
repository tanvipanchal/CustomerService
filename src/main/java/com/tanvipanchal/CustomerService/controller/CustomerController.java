package com.tanvipanchal.CustomerService.controller;

import com.tanvipanchal.CustomerService.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tpanchal
 */

@RestController
public class CustomerController {

    @PostMapping("/customers")
    public String createCustomer(@RequestBody final Customer customer) {
        System.out.print(customer);
        return "1";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
