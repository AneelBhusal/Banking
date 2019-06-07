package com.cubic.banking.Autoloans.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cubic.banking.Autoloans.DTO.AddressDTO;
import com.cubic.banking.Autoloans.DTO.ApplicationDTO;
import com.cubic.banking.Autoloans.DTO.ApplicationStatusDTO;
import com.cubic.banking.Autoloans.DTO.LoanDTO;
import com.cubic.banking.Autoloans.DTO.PaymentsDTO;
import com.cubic.banking.Autoloans.DTO.VehicleDTO;
import com.cubic.banking.Autoloans.Dao.AddressDao;
import com.cubic.banking.Autoloans.Dao.ApplicationDao;
import com.cubic.banking.Autoloans.Dao.ApplicationStatusDao;
import com.cubic.banking.Autoloans.Dao.LoanDao;
import com.cubic.banking.Autoloans.Dao.PaymentsDao;
import com.cubic.banking.Autoloans.Dao.VehicleDao;

@Component
public class BankingDelegate implements Delegate{
	
	@Autowired
	ApplicationStatusDao asdao;
	
	@Autowired
	ApplicationDao adao;
	
	@Autowired
	VehicleDao vdao;
	
	@Autowired
	LoanDao ldao;
	
	@Autowired
	PaymentsDao pdao;
	
	@Autowired
	AddressDao addao;

	@Override
	public PaymentsDTO save(PaymentsDTO pto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VehicleDTO save(VehicleDTO vto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanDTO save(LoanDTO lto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplicationStatusDTO save(ApplicationStatusDTO asto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplicationDTO save(ApplicationDTO ato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO save(AddressDTO adto) {
		// TODO Auto-generated method stub
		return null;
	}

}
