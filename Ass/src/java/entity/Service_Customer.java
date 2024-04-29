/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.*;

public class Service_Customer {

    @PersistenceContext
    EntityManager mgr;
    @Resource
    Query query;

    public Service_Customer(EntityManager mgr) {
        this.mgr = mgr;
    }

    public boolean addCustomer(Customer customer) {
        mgr.persist(customer);
        return true;
    }

    
    public Customer findCustomerByname(String username) {
        Customer customer = mgr.find(Customer.class, username);
        return customer;
    }

    public boolean deleteCustomer(String username) {
         Customer customer = findCustomerByname(username);
        if (customer != null) {
            mgr.remove(customer);
            return true;
        }
        return false;
    }

    public List<Customer> findAll() {
        List customerList = mgr.createNamedQuery("Customer.findAll").getResultList();
        return customerList;
    }

    public boolean updateCustomer(Customer customer) {
        Customer tempCustomer = findCustomerByname(customer.getUsername());
        if (tempCustomer != null) {
            tempCustomer.setCustEmail(customer.getCustEmail());
            tempCustomer.setCustPass(customer.getCustPass());
            tempCustomer.setCustPhone(customer.getCustPhone());
            tempCustomer.setCustAddress(customer.getCustAddress());
            return true;
        }
        return false;
    }
}
