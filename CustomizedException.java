package com.codegnan.day24;

// customized exception
class TooYoungException extends Exception {

	public TooYoungException(String message) {
		super(message);
	}

}

class TooOldException extends Exception {

	public TooOldException(String message) {
		super(message);
	}

}

public class CustomizedException {
	public void CheckEligibility(int age) throws TooYoungException, TooOldException {
		if (age < 18) {
			throw new TooYoungException(" Marriage cannot be approved..... Your age is below 18 years.");
		} else if (age > 60) {
			throw new TooOldException(
					" Your age is already crossed the marriage age.....Marriage cannot be approved. ");
		} else {
			System.out.println("Marriage is approved...Details will be processed soon");
		}
	}

	public static void main(String[] args) {
		CustomizedException checker = new CustomizedException();
		try {
			checker.CheckEligibility(40);
		} catch (TooYoungException | TooOldException e) {
			e.printStackTrace();
		}

	}

}
