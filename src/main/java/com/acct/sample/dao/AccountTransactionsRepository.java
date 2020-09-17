package com.acct.sample.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.acct.sample.model.AccountTransactions;


@Repository
@Transactional
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Long> {
    
	/*
	 * Account transaction data access class - Bank account service
	 * 
	 * 
	 * @Author Dudula Malagala
	 * 
	 *  Date		Version		Name	Comments
	 *  17/09/2020  1.0 		Dudula	Initial version
	 */
	
	List<AccountTransactions> findByAccountNumber(Long accountNumber);

}