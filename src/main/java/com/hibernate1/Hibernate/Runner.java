package com.hibernate1.Hibernate;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Runner{
	public static void save(Session session) {
		Transaction trx=session.beginTransaction();
		student st1=new student();
		address ad1=new address();
		st1.setName("Rudraa");
		st1.setSno(2);
		st1.setPassword("rudraa@312");
		ad1.setCity("mandoli");
		ad1.setPlace("rawalpindi");
		st1.setAddress(ad1);
		session.persist(st1);
		trx.commit();
		
	}
	public static List fetchallstudent(Session session) {
		List<student> resultList=session.createQuery("from student", student.class).getResultList();
		return resultList;
		
	}
	

	public static void main(String[] args) {
		Session session=App.getSessionFactory().openSession();
		save(session);
//		student student= session.get(student.class, 1);
//		System.out.println(student);
	}

}
