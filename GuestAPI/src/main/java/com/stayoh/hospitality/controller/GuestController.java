package com.stayoh.hospitality.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.stayoh.hospitality.entity.Guest;
import com.stayoh.hospitality.usecase.GuestUsecaseImpl;

@RestController
@RequestMapping("/api")
public class GuestController {
	@Autowired GuestUsecaseImpl guestImpl;
	
	
	@PostMapping("/guest")
	public Guest createGuest(@RequestBody Guest guest)
	{
		return guestImpl.save(guest);
	}
	
	@GetMapping("/guest")
	public List<Guest> findAllGuest()
	{
		return guestImpl.findAll();
	}
	
	@GetMapping("/guest/{id}")
	public Optional<Guest> findOneGuest(@PathVariable("id") Long id)
	{
		return guestImpl.findById(id);
	}
	
	@PutMapping("/guest/{id}")
	public Guest updateGuest(@PathVariable("id") Long id,@RequestBody Guest guest)
	{
		Guest note = guestImpl.findById(id).orElseThrow(() -> new ResourceAccessException("not found"));
		note.setName(guest.getName());
		return guestImpl.update(note);
	}
	
	@DeleteMapping("/guest/{id}")
	public void deleteGuest(@PathVariable("id") Long gid)
	{
		guestImpl.delete(gid);
	}

}
