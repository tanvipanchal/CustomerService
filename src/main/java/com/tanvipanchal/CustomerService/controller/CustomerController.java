package com.tanvipanchal.CustomerService.controller;

import com.tanvipanchal.CustomerService.model.Customer;
import com.tanvipanchal.CustomerService.util.Helper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * @author tpanchal
 */

@RestController
public class CustomerController {

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody final Customer customer) {
        System.out.print(customer);
        Customer customerResponse = new Customer();
        String customerId = UUID.randomUUID().toString();
        customerResponse.setId(customerId);
        customerResponse.setName(customer.getName());
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setPhone(customer.getPhone());
        customerResponse.setAddress(customer.getAddress());
        customerResponse.setNotes(customer.getNotes());
        return ResponseEntity.status(HttpStatus.CREATED)
                        .contentType(MediaType.APPLICATION_JSON)
                .body(customerResponse);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return Helper.getSampleCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(final String id) {
        return Helper.getSampleCustomer();
    }

    @PatchMapping("/customers")
    public Customer patchCustomer(@RequestBody Customer c) {
        System.out.println(c);
        return c;
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(final String id){
        System.out.println(id);
    }
}
