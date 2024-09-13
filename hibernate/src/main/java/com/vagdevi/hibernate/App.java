package com.vagdevi.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("config.hbm.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		Student student=new Student();
		student.setId(1);
		student.setName("Klassen");
		student.setAddress("Hyd");
		try
		{
			session.save(student);
			t.commit();
			System.out.println("Student saved Successfully");
		}
		catch(Exception e)
		{
			System.out.println("try again");
			e.printStackTrace();
			
		}
		
	
     }
}
