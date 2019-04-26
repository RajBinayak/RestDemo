package com.stayoh.hospitality.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stayoh.hospitality.entity.Guest;

@Repository
public interface GuestJpaRepository extends JpaRepository<Guest, Long> {

}
