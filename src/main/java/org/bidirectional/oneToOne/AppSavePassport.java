package org.bidirectional.oneToOne;

import org.bidirectional.oneToOne.entity.Employee;
import org.bidirectional.oneToOne.entity.Passport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.unidirectional.JulyHibernateOneToOne.utility.HIbernateUtility;
//not possible
public class AppSavePassport {
	
	public static void main(String[] args) {
		SessionFactory factory= HIbernateUtility.getSessionFactory();
		  Session session= factory.openSession();
		  Transaction transaction = session.beginTransaction();
		  
		  //this is not going to work ->
		  //because, we are injecting employee in passport and saving passport here
		  //but relation data/ relation column is available in employee table
		  //so we alwasy need to inject passport in employee.
		  
		  // you need to save employee i.e. a table which is holding relation column (passport_id)
		
		  
		  Employee e = new Employee();
		  e.setName("Michael");
		  
		  //e.setPassport(p);
		  
		  Passport p = new Passport();
		  p.setPassportNumber("987234567");
		  p.setEmployee(e);
		  
		  session.persist(p);
		  session.persist(e);
	
		  
		  transaction.commit();
		  session.close();
	}

}
