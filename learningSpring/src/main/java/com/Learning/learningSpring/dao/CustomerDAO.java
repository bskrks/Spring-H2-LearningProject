package com.Learning.learningSpring.dao;

import com.Learning.learningSpring.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {  // integer koymamızın nedeni id nin veri tipini temsil etmesi
    @Override
    List<Customer> findAll();
}
