package com.example.springbootstarterweb.resolver;

import java.util.UUID;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springbootstarterweb.domain.bank.BankAccount;
import com.example.springbootstarterweb.domain.bank.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Controller
public class BankAccountResolver implements GraphQLQueryResolver{
	
	@QueryMapping
	public BankAccount bankAccount(@Argument UUID id) {
		System.out.print("hieu so get here");
		BankAccount bankAccount = new BankAccount(id, "hieu", Currency.CHF);
		return bankAccount;
	}
}
