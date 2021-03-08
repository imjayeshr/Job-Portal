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
public class CompanyException extends Exception {


		public CompanyException(String message)
		{
			super("CompanyException-"+message);
		}
		
		public CompanyException(String message, Throwable cause)
		{
			super("CompanyException-"+message,cause);
		}
		
	}

