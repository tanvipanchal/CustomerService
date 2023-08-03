package com.tanvipanchal.CustomerService.util;

import com.tanvipanchal.CustomerService.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author tpanchal
 */

public class Helper {

    public static List<Customer> getSampleCustomers() {
        List<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer();
        c1.setId(UUID.randomUUID().toString());
        c1.setName("Niya");
        c1.setEmail("Niya@gmail.com");
        c1.setPhone("+19842784455");
        c1.setAddress("12399 Brook Street, Chicago, 88123");
        c1.setNotes("premium customer");

        Customer c2 = new Customer();
        c2.setId(UUID.randomUUID().toString());
        c2.setName("Lee");
        c2.setEmail("Lee@gmail.com");
        c2.setPhone("+19933778989");
        c2.setAddress("333 lime Street, Las Vegas, 88123");
        c2.setNotes("VIP customer");

        customers.add(c1);
        customers.add(c2);

        return customers;
    }

    public static Customer getSampleCustomer() {

        Customer c1 = new Customer();
        c1.setId(UUID.randomUUID().toString());
        c1.setName("Bob");
        c1.setEmail("bob@gmail.com");
        c1.setPhone("+19966223390");
        c1.setAddress("12399 Yard Street, New Jersey, 88123");
        c1.setNotes("premium customer");

        return c1;
    }
}
