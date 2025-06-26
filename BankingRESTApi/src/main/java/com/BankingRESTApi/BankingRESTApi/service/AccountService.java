package com.BankingRESTApi.BankingRESTApi.service;

import com.BankingRESTApi.BankingRESTApi.dto.AccountDto;
import com.BankingRESTApi.BankingRESTApi.entity.Account;

import java.util.List;

public interface AccountService {
//    Account createAccount(Account account);
//    AccountDto createAccount(AccountDto accountDto);not working
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
    AccountDto withdraw(Long id,double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);


}
