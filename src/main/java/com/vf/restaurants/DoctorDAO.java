package com.vf.restaurants;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DoctorDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public boolean persist(Doctor doc) {
		sessionFactory.getCurrentSession().save(doc);
		return true;
	}

}
