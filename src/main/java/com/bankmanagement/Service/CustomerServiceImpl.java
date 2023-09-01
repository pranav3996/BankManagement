package com.bankmanagement.Service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import com.bankmanagement.Entity.Customer;
import com.bankmanagement.Repository.CustomerRepository;
import com.bankmanagement.model.CustomerPojo;
import com.bankmanagement.model.CustomerSave;
import com.bankmanagement.model.CustomerUpdate;




@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String addCustomer( CustomerSave customerSave) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(
				   
	                customerSave.getFirstName(),
	                customerSave.getMiddleName(),
	                customerSave.getLastName(),
	                customerSave.getEmail(),
	                customerSave.getMobileNumber(),
	                customerSave.getAlterNumber(),
	                customerSave.getDate(),
	                customerSave.getAadhaar(),
	                customerSave.getPan(),
	                customerSave.getMarriedStatus(),
	                customerSave.getAddressType(),
	                customerSave.getOccupation(),
	                customerSave.getStreetAddress(),
	                customerSave.getCity(),
	                customerSave.getState(),
	                customerSave.getZip()
	              
	        );
		 
	        customerRepository.save(customer);
	        
	        return customer.getFirstName();
	}

	@Override
	  public List<CustomerPojo> getAllCustomer() {
        
		  List<Customer> getCustomers = customerRepository.findAll();
	       List<CustomerPojo> customerPojoList = new ArrayList<>();

	    	   for(Customer a:getCustomers)
	       {
	           CustomerPojo customerPojo = new CustomerPojo(
                        a.getC_id(),
	        		    a.getFirstName(),
		                a.getMiddleName(),
		                a.getLastName(),
		                a.getEmail(),
		                a.getMobileNumber(),
		                a.getAlterNumber(),
		                a.getDate(),
		                a.getAadhaar(),
		                a.getPan(),
		                a.getMarriedStatus(),
		                a.getAddressType(),
		                a.getOccupation(),
		                a.getStreetAddress(),
		                a.getCity(),
		                a.getState(),
		                a.getZip()
	           );
	           customerPojoList.add(customerPojo);
	       }

	       return  customerPojoList;
	    }

	@Override
	public String updateCustomers(CustomerUpdate customerUpdate) {
		// TODO Auto-generated method stub
		if (customerRepository.existsById(customerUpdate.getC_id())) {
            Customer customer = customerRepository.getById(customerUpdate.getC_id());
            //getById(customerUpdate.getC_id());
 
 
            customer.setFirstName(customerUpdate.getFirstName());
            customer.setMiddleName(customerUpdate.getMiddleName());
            customer.setLastName(customerUpdate.getLastName());
            customer.setEmail(customerUpdate.getEmail());
            customer.setDate(customerUpdate.getDate());
            customer.setAadhaar(customerUpdate.getAadhaar());
            customer.setPan(customerUpdate.getPan());
            customer.setMarriedStatus(customerUpdate.getMarriedStatus());
            customer.setOccupation(customerUpdate.getOccupation());
            customer.setAddressType(customerUpdate.getAddressType());
            customer.setStreetAddress(customerUpdate.getStreetAddress());
            customer.setCity(customerUpdate.getCity());
            customer.setState(customer.getState());
            customer.setZip(customerUpdate.getZip());
            
            customerRepository.save(customer);
        }
            else
            {
                System.out.println("Customer ID do not Exist");
            }
 
                return null;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		 if(customerRepository.existsById(id))
	        {
			 customerRepository.deleteById(id);
	        }
	        else
	        {
	            System.out.println("customer id not found");
	        }
	 
	        return true;
	    }
	}
	


