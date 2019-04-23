package com.hp.mydemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hp.mydemo.model.Emp;
@Repository
public interface EmpRepoCrud extends CrudRepository<Emp, Integer> {

}
