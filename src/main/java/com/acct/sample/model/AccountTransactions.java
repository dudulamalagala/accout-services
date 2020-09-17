package com.acct.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_TRANSACTIONS")
public class AccountTransactions {
	
	/*
	 * Account Transactions List Inquiry table - Bank account service
	 * 
	 * 
	 * @Author Dudula Malagala
	 * 
	 *  Date		Version		Name	Comments
	 *  17/09/2020  1.0 		Dudula	Initial version
	 */
	
    @Column(name="account_number")
    private Long accountNumber;

    @Column(name="account_name")
    private String accountName;

    @Column(name="account_value_date")
    private String accountValueDate;

    @Column(name="account_currency")
    private String accountCurrency;

    @Column(name="account_credit_amt")
    private Float accountCreditAmt;

    @Column(name="account_debit_amt")
    private Float accountDebitAmt;

    @Column(name="account_debit_credit")
    private String accountDebitCredit;

    @Column(name="account_transaction_narrative")
    private String accountTransactionNarrative;
    
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

	public String getAccountValueDate() {
		return accountValueDate;
	}

	public void setAccountValueDate(String accountValueDate) {
		this.accountValueDate = accountValueDate;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public Float getAccountCreditAmt() {
		return accountCreditAmt;
	}

	public void setAccountCreditAmt(Float accountCreditAmt) {
		this.accountCreditAmt = accountCreditAmt;
	}

	public Float getAccountDebitAmt() {
		return accountDebitAmt;
	}

	public void setAccountDebitAmt(Float accountDebitAmt) {
		this.accountDebitAmt = accountDebitAmt;
	}

	public String getAccountDebitCredit() {
		return accountDebitCredit;
	}

	public void setAccountDebitCredit(String accountDebitCredit) {
		this.accountDebitCredit = accountDebitCredit;
	}

	public String getAccountTransactionNarrative() {
		return accountTransactionNarrative;
	}

	public void setAccountTransactionNarrative(String accountTransactionNarrative) {
		this.accountTransactionNarrative = accountTransactionNarrative;
	}

}

