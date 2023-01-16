package com.example.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springbootstarterweb.domain.bank.BankAccount;
import com.example.springbootstarterweb.domain.bank.Currency;
import com.example.springbootstarterweb.resolver.BankAccountResolver;

@Controller
public class BankAccountController {
//	@Autowired
//	BankAccountResolver bankAccountResolver;
//	
//	@QueryMapping
//	public BankAccount bankAccount(UUID id) {
//		System.out.print("hieu so get here");
//		BankAccount bankAccount = new BankAccount(id, "hieu", Currency.CHF);
//		return bankAccount;
//	}
	
	@QueryMapping
	public String status() {
		
		return "Getting here first";
	}
	
	
}
