/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.JobPortal.exception;

/**
 *
 * @author joaey
 */
public class JobsException extends Exception {

	public JobsException(String message)
	{
		super("JobsException-"+message);
	}
	
	public JobsException(String message, Throwable cause)
	{
		super("JobsException-"+message,cause);
	}
	
}
