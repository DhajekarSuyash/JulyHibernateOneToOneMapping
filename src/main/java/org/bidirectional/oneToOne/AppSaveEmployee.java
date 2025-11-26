package org.bidirectional.oneToOne;

import org.bidirectional.oneToOne.entity.Employee;
import org.bidirectional.oneToOne.entity.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.unidirectional.JulyHibernateOneToOne.utility.HIbernateUtility;

public class AppSaveEmployee {

	public static void main(String[] args) {
		
		  SessionFactory factory= HIbernateUtility.getSessionFactory();
		  Session session= factory.openSession();
		  Transaction transaction = session.beginTransaction();
		  
		  Passport passport = new Passport();
		  passport.setPassportNumber("7896587565");
		  
		  Employee e = new Employee();
		  e.setName("Chris");
		  e.setPassport(passport);
		  
		  session.persist(passport);
		  session.persist(e);
		  
		  transaction.commit();
		  session.close();
	}

}
