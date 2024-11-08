package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class IncorrectPinLimitReachedException  extends Exception{
		public IncorrectPinLimitReachedException (String errorMsg) {
			super(errorMsg);
		}
}
