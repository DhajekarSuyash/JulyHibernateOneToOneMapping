package org.unidirectional.JulyHibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.unidirectional.JulyHibernateOneToOne.entity.Document;
import org.unidirectional.JulyHibernateOneToOne.entity.Student;
import org.unidirectional.JulyHibernateOneToOne.utility.HIbernateUtility;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Document d = new Document();
		d.setAdharCardNo(12334324l);
		d.setPanCard("ABCDEFGH");
		
		Student student = new Student();
		student.setName("RAM");
		student.setCity("PUNE");
		student.setDocument(d);
		
		System.out.println("Hello World!");
		SessionFactory factory = HIbernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(student);
		transaction.commit();
		session.close();
	}
}
