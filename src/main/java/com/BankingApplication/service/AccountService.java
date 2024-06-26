package com.BankingApplication.service;

import java.util.List;

import com.BankingApplication.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto account);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double amount);
	
	AccountDto Withdraw(Long id, double amount);
	
	List<AccountDto> getAllAccounts();
	
	void DeleteAccount(Long id);

}
