package org.robockets.robotswitcher;

@SuppressWarnings("serial")
public class DoesNotExistException extends Exception {
	public DoesNotExistException() {}
	public DoesNotExistException(String msg) {
		super(msg);
	}
}
