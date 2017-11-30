package Exceptions;

public class DateOfOfBondException extends Exception {

	public DateOfOfBondException (String message) {
	
	super("Value of Date is out of bounds!!!" + message);
	
	}
}
