package com.example.demoh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoh2.model.OrderUser;


@Repository
public interface JpaRepo extends JpaRepository<OrderUser, Integer>{

}
