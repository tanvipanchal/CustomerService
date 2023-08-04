package com.tanvipanchal.CustomerService.util;

import com.tanvipanchal.CustomerService.model.Customer;

import java.util.*;

/**
 * @author tpanchal
 */

public class Helper {

    private HashMap<String,Customer> customers = new HashMap<>();

    public List<Customer> getAllCustomers() {

        return new ArrayList<>((Collection) customers.values());
    }

    public Customer getCustomer(String id) {

        return ((Customer) customers.get(id));
    }

    public void createCustomer(String id, Customer c) {
        c.setId(id);
        customers.put(id, c);
    }

    public Customer patchCustomer(Customer c){
        Customer customer = customers.get(c.getId());
        customer = c;
        customer.setId(c.getId());
        return customer;
    }

    public List<Customer> deleteCustomer(String id){
        customers.remove(id);
        return new ArrayList<>((Collection) customers.values());
    }
}
