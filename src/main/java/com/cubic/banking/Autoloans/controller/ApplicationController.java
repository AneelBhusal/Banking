package com.cubic.banking.Autoloans.controller;

import org.springframework.boot.ApplicationArguments;

import com.cubic.banking.Autoloans.DTO.ApplicationDTO;
import com.cubic.banking.Autoloans.DTO.ApplicationStatusDTO;

public interface ApplicationController {
	
	ApplicationDTO save(ApplicationDTO dto);

	ApplicationStatusDTO save(ApplicationStatusDTO dto);

	ApplicationDTO get(ApplicationArguments dto);

	ApplicationStatusDTO get(ApplicationStatusDTO dto);
	
	

}
