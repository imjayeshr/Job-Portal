/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.JobPortal.validator;

/**
 *
 * @author joaey
 */
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.me.JobPortal.pojo.Company;



public class CompanyValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(Company.class);
	}

	public void validate(Object obj, Errors errors) {
		Company comp = (Company) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", "error.invalid.comp", "Company Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyAddress", "error.invalid.comp", "Company Address Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyDescription", "error.invalid.comp", "Company Description Required");
		
		// check if user exists
		
	}
	
}
