package com.stayoh.hospitality.usecase;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.stayoh.hospitality.entity.Guest;
import com.stayoh.hospitality.gateway.GuestGatewaySql;

@Service
public class GuestUsecaseImpl implements GuestUsecase {
	@Autowired GuestGatewaySql guestSql;
	
	@Override
	public Guest save(Guest guest) {
		return guestSql.save(guest);
	}

	@Override
	public List<Guest> findAll() {
		return guestSql.findAll();
	}

	@Override
	public Optional<Guest> findById(Long gid) {
		return guestSql.findById(gid);
	}

	@Override
	public Guest update(@RequestBody Guest guest) {
		
		return guestSql.update(guest);
	}

	@Override
	public Integer delete(Long gid) {
		try {
		 guestSql.delete(gid);
		}
		catch(Exception e)
		{
			return 0;
		}
		return 1;
	}

}
