package com.capgemini.person.test;

import com.capgemini.person.dao.impl.*;
import com.capgemini.person.model.*;

public class Main{
	public static void main(String args[]){

		PersonDaoImpl person=new PersonDaoImpl();
		person.addPerson(new Person(102,"John"));
		System.out.println("Success...!!!!!");
	}
}