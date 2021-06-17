package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		/* AdminClass a=new AdminClass();
		a.setId(102);
		a.setName("avatar");
		a.setMarks(8795); 
		ses.save(a); */
		
		AdminClass a=ses.get(AdminClass.class, 101);
		tx.commit();
		ses.close();
		System.out.println(a);
		tx.close();
	}
}
