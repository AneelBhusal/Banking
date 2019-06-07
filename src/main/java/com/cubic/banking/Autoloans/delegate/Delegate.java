package com.cubic.banking.Autoloans.delegate;

import com.cubic.banking.Autoloans.DTO.AddressDTO;
import com.cubic.banking.Autoloans.DTO.ApplicationDTO;
import com.cubic.banking.Autoloans.DTO.ApplicationStatusDTO;
import com.cubic.banking.Autoloans.DTO.LoanDTO;
import com.cubic.banking.Autoloans.DTO.PaymentsDTO;
import com.cubic.banking.Autoloans.DTO.VehicleDTO;

public interface Delegate {
	
	PaymentsDTO save(PaymentsDTO pto);
	VehicleDTO save(VehicleDTO vto);
	LoanDTO save(LoanDTO lto);
	ApplicationStatusDTO save(ApplicationStatusDTO asto);
	ApplicationDTO save(ApplicationDTO ato);
	AddressDTO save(AddressDTO adto);
}
