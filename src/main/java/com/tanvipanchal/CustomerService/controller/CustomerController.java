package com.tanvipanchal.CustomerService.controller;

import com.tanvipanchal.CustomerService.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
