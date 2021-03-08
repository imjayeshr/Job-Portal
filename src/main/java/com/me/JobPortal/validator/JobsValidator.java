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

import com.me.JobPortal.pojo.JobList;

public class JobsValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(JobList.class);
	}

	public void validate(Object obj, Errors errors) {
		JobList job = (JobList) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobName", "error.invalid.job", "Job Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobDesc", "error.invalid.job", "Job Description Required");
	
		
		// check if user exists
		
	}
	
}
