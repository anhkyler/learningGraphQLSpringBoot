package com.example.springbootstarterweb.domain.bank;

import java.util.UUID;

public class BankAccount {
	private UUID id;
	private String name;
	private Currency currency;
	
	public BankAccount(UUID id, String name, Currency currency) {
		super();
		this.id = id;
		this.name = name;
		this.currency = currency;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
}
