package com.bankmanagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bankmanagement.Repository.CustomerRepository;
import com.bankmanagement.model.CustomerPojo;
import com.bankmanagement.model.CustomerSave;
import com.bankmanagement.model.CustomerUpdate;

public interface CustomerService {
	

	String addCustomer(CustomerSave customerSave);

	List<CustomerPojo> getAllCustomer();

	String updateCustomers(CustomerUpdate customerUpdate);

	boolean deleteCustomer(int id);
}
