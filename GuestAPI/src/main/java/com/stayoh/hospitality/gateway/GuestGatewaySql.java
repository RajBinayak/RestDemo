package com.stayoh.hospitality.gateway;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.stayoh.hospitality.entity.Guest;
import com.stayoh.hospitality.repository.GuestJpaRepository;

@Service
public class GuestGatewaySql implements GuestGateway {
	@Autowired GuestJpaRepository gustRepository;

	@Override
	public Guest save(Guest guest) {
		return gustRepository.save(guest);
	}

	@Override
	public List<Guest> findAll() {
		return gustRepository.findAll();
	}

	@Override
	public Optional<Guest> findById(Long gid) {
		return gustRepository.findById(gid);
	}

	@Override
	public Guest update(@RequestBody Guest guest) {
		
		return gustRepository.save(guest);
	}

	@Override
	public String delete(Long id) {
		try
		{
			gustRepository.deleteById(id);
		}
		catch(Exception e)
		{
			return "UnSuccess";
		}
		return "Success";
	}

}
