package com.acct.sample.model;

import java.sql.Date;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "Account")
public class Account {
	
	/*
	 * Account List Inquiry table - Bank account service
	 * 
	 * @Author Dudula Malagala
	 * 
	 *  Date		Version		Name	Comments
	 *  17/09/2020  1.0 		Dudula	Initial version
	 */
	
	@Id
    @Column(name="account_number", unique = true, nullable = false)
    private Long accountNumber;

    @Column(name="account_name")
    private String accountName;

    @Column(name="account_type")
    private String accountType;

    @Column(name="balance_date")
    private Date balanceDate;

    @Column(name="account_currency")
    private String accountCurrency;

    @Column(name="account_balance")
    private Long accountBalance;

    public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}

