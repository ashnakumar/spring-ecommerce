package com.ashna.ecommerce.dao;

import com.ashna.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
