package com.fazlaysapaylas.test;

import org.hibernate.Session;

import com.fazlaysapaylas.utils.HibernateUtil;

public class Test {
	
	Session session=null;
	
	private void sessionBaslangic() {
		session=HibernateUtil.getSession();
		session.beginTransaction();
	}
	
	private void sessionBitis(){
		session.getTransaction().commit();
		session.close();		
	}
	
	private void tablolariOlustur(){
		sessionBaslangic();		
		sessionBitis();
	}
	
	public static void main(String[] args) {		
		Test test=new Test();		
		test.tablolariOlustur();			
	}

}
