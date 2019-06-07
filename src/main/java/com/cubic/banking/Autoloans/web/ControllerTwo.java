package com.cubic.banking.Autoloans.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.banking.Autoloans.delegate.BankingDelegate;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	BankingDelegate bdelg;

}
