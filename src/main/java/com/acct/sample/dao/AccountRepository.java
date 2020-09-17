package com.acct.sample.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.acct.sample.model.Account;

import javax.transaction.Transactional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {  
	
	/*
	 * Account data access class - Bank account service
	 * 
	 * 
	 * @Author Dudula Malagala
	 * 
	 *  Date		Version		Name	Comments
	 *  17/09/2020  1.0 		Dudula	Initial version
	 */
	
	List<Account> findAll();

    Account findByAccountNumber(Long accountNumber);

}  
