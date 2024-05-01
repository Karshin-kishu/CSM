package com.app.CustomException;

@SuppressWarnings("serial")
public class InvalidCreds extends Exception{
	public InvalidCreds (String s1) {
		super(s1);
	}
	
}
