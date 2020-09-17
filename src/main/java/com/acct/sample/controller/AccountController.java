package com.acct.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.acct.sample.dao.AccountRepository;
import com.acct.sample.dao.AccountTransactionsRepository;
import com.acct.sample.exception.AccountTransNotFoundException;
import com.acct.sample.model.Account;
import com.acct.sample.model.AccountTransactions;


@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	AccountTransactionsRepository accountTransactionsRepository;
	
	@GetMapping("/")
    public List<Account> listAll() {
        return accountRepository.findAll();
    }
	
	 @GetMapping("/listTransactions/{id}")
    public List<AccountTransactions> listTransactions(@PathVariable(value = "id") Long id) throws Exception {
        List<AccountTransactions> acctTransactions = accountTransactionsRepository.findByAccountNumber(id);

        if (acctTransactions.size() == 0)
            throw new AccountTransNotFoundException("Transactions not found for account number:" + id);

        return acctTransactions;
    }
}
