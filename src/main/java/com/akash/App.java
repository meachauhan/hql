package com.akash;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akash.bean.User;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		User u1=new User("Tannu Chauhan","tannuchauhan345@gmail.com");
		session.save(u1);
		transaction.commit();
		System.out.println("Record Inserted");
		session.close();
    }
}
