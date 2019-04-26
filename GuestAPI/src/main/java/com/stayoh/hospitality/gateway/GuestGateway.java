package com.stayoh.hospitality.gateway;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.stayoh.hospitality.entity.Guest;

public interface GuestGateway {
	

	Guest save(Guest guest);
	
	List<Guest> findAll();
	
	Optional<Guest> findById(Long gid);
	
	Guest update(@RequestBody Guest guest);
	
	String delete(Long gid);

}

