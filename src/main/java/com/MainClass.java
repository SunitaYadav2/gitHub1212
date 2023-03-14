package com;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
public class MainClass {

	public static void main(String[] args) {

		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        //--------------------------
        Student st= new Student(1,"sunita",555);
            session.save(st);
            
            
            Student st1= new Student(2,"binita",545);
            session.save(st1);
            
            
            Student st2= new Student(3,"rita",565);
            session.save(st2);
            
            Student st3= new Student(4,"peter",575);
            session.save(st3);
            
            
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------
        

 

	}

}
