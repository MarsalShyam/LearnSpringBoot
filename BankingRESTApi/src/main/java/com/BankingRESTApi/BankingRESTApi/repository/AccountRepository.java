package com.BankingRESTApi.BankingRESTApi.repository;

import com.BankingRESTApi.BankingRESTApi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
