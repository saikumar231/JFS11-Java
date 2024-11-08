package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class InsufficientMachineBalnaceException extends Exception {
	public InsufficientMachineBalnaceException (String errormsg) {
		super(errormsg);
	}

}
