package com.eventmanager.manager.services;

import java.util.List;

import com.eventmanager.manager.payloads.RegistrationDto;

public interface RegistrationService {
	RegistrationDto createRegistration(RegistrationDto regDto, Integer eventId, Integer stdId);
	
	List<RegistrationDto> getAllRegistrations();
	
	RegistrationDto getRegById(Integer regId);
	
	void deleteRegistration(Integer regId);
}
