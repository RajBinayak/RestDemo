package com.stayoh.hospitality.usecase;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.stayoh.hospitality.entity.Guest;

public interface GuestUsecase {
	
	Guest save(Guest guest);
	
	List<Guest> findAll();
	
	Optional<Guest> findById(Long gid);
	
	Guest update(@RequestBody Guest guest);
	
	Integer delete(Long gid);

}
