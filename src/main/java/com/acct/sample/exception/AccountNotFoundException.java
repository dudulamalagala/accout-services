package com.acct.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {
	
	/*
	 * Exception message when account list is empty - Bank account service
	 * 
	 * 
	 * @Author Dudula Malagala
	 * 
	 *  Date		Version		Name	Comments
	 *  17/09/2020  1.0 		Dudula	Initial version
	 */
	
	private static final long serialVersionUID = -9200192257393631883L;

	public AccountNotFoundException(String exception ){
        super(exception);
    }
}
