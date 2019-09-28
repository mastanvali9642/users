package com.usa.ies.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usa.ies.admin.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	
}
