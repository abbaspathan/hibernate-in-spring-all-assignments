package com.capgemini.person.dao.impl;

import com.capgemini.person.factory.*;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;
import com.capgemini.person.dao.*;
import com.capgemini.person.model.*;

public class PersonDaoImpl implements PersonDao{

	public void addPerson(Person person){
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();

		session.save(person);

		tx.commit();
		HibernateUtil.closeSessionFactory();
	}
}