package com.bankmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.bankmanagement.Service.CustomerService;

import com.bankmanagement.model.CustomerPojo;
import com.bankmanagement.model.CustomerSave;
import com.bankmanagement.model.CustomerUpdate;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController
{
   @Autowired
   private CustomerService customerService;

   @PostMapping(path = "/save")
   public String saveCustomer(@RequestBody CustomerSave customerSaveDTO)
   {
       String id = customerService.addCustomer(customerSaveDTO);
       return id;
   }

   @GetMapping(path = "/getAllCustomer")
   public List<CustomerPojo> getAllCustomer()
   {
      List<CustomerPojo>allCustomers = customerService.getAllCustomer();
      return allCustomers;
   }

   @PutMapping(path = "/update")

   public String updateCustomer(@RequestBody CustomerUpdate customerUpdateDTO)
   {
       String id = customerService.updateCustomers(customerUpdateDTO);
       return id;
   }

   @DeleteMapping(path = "/deletecustomer/{id}")
   public String deleteCustomer(@PathVariable(value = "id") int id)
   {
       boolean deletecustomer = customerService.deleteCustomer(id);
       return "deleted";
   }

}