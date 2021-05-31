package com.cg.na.exceptions;
/**
 * this will create PaymentException object without showing error
 * @author admin
 *
 */
public class PaymentException extends Exception {
	
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
public PaymentException() {
	super();
}
public PaymentException(String errMsg) {
	super(errMsg);
}
}
