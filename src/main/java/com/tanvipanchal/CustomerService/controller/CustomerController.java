package com.tanvipanchal.CustomerService.controller;

import com.tanvipanchal.CustomerService.model.Customer;
import com.tanvipanchal.CustomerService.util.Helper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tpanchal
 */

@RestController
public class CustomerController {

    private Helper helper = new Helper();
    int counter = 0;

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody final Customer customer) {
        System.out.print(customer);
        String customerId = String.valueOf(++counter); //= UUID.randomUUID().toString();
        helper.createCustomer(customerId, customer);
        Customer customerResponse = new Customer();
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
        return helper.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        return helper.getCustomer(id);
    }

    @PatchMapping("/customers")
    public Customer patchCustomer(@RequestBody Customer c) {
        System.out.println(c);
        return helper.patchCustomer(c);
    }

    @DeleteMapping("/customers/{id}")
    public List<Customer> deleteCustomer(@PathVariable String id){
        System.out.println(id);
        return helper.deleteCustomer(id);
    }
}
