package com.cubic.banking.Autoloans.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cubic.banking.Autoloans.repo.AdressRepo;
import com.cubic.banking.Autoloans.repo.ApplicationRepo;
import com.cubic.banking.Autoloans.repo.ApplicationStatusRepo;
import com.cubic.banking.Autoloans.repo.LoanRepo;
import com.cubic.banking.Autoloans.repo.PaymentsRepo;
import com.cubic.banking.Autoloans.repo.VehicleRepo;

@Component
public class BaseDao implements BaseDaoIf{
	
	@Autowired
	ApplicationStatusRepo asr;
	
	@Autowired
	ApplicationRepo ar;
	
	@Autowired
	VehicleRepo vr;
	
	@Autowired
	LoanRepo lr;
	
	@Autowired
	PaymentsRepo pr;
	
	@Autowired
	AdressRepo adr;

	@Override
	public Object save(Object o) {

		return null;
	}

	@Override
	public Object update(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object delete(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
