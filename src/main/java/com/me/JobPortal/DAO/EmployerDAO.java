/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.JobPortal.DAO;

/**
 *
 * @author joaey
 */
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.me.JobPortal.pojo.User;



public class EmployerDAO extends DAO {
	
	public EmployerDAO(){
		
	}
	
	public User getByTitle(String keyword) {
		User user=new User();
		try {
			begin();
			Query q = getSession().createQuery("from Movies where title= :title");
			q.setString("title", keyword);
			
			user = (User) q.uniqueResult();
			commit();
			return user;
		} 
		
		catch (HibernateException e) {
			rollback();
			//throw new UserException("Could not get user " + movies, e);
		}
		
		return null;
		
		
	}
}
