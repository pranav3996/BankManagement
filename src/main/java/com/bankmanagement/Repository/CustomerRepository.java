package com.bankmanagement.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.bankmanagement.Entity.Customer;




@EnableJpaRepositories
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer > {
	



} 
