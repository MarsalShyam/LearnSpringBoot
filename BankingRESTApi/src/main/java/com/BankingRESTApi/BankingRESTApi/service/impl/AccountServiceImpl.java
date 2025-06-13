package com.BankingRESTApi.BankingRESTApi.service.impl;

import com.BankingRESTApi.BankingRESTApi.dto.AccountDto;
import com.BankingRESTApi.BankingRESTApi.entity.Account;
import com.BankingRESTApi.BankingRESTApi.mapper.AccountMapper;
import com.BankingRESTApi.BankingRESTApi.repository.AccountRepository;
import com.BankingRESTApi.BankingRESTApi.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        //Here we need mapper
        Account account= AccountMapper.mapToAccount(accountDto);
        Account savedAccount=accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
