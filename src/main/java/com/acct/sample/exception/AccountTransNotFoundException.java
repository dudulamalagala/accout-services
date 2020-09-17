package com.acct.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountTransNotFoundException extends RuntimeException {
	
	/*
	 * Exception message when account transaction list is empty - Bank account service
	 * 
	 * 
	 * @Author Dudula Malagala
	 * 
	 *  Date		Version		Name	Comments
	 *  17/09/2020  1.0 		Dudula	Initial version
	 */
	
	private static final long serialVersionUID = -3182274998920676009L;

	public AccountTransNotFoundException(String exception ){
        super(exception);
    }
}
