package com.inder.demoSqlApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {
    public static void main( String[] args ) {
    	EmployeeModel emp = new EmployeeModel();
    	emp.setEmpname("Amit");
    	emp.setEmpmail("amit@testing.com");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myFirstPU");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(emp);
    	em.getTransaction().commit();
    	
    	EmployeeModel emp1 = em.find(EmployeeModel.class, 2);
    	
    	System.out.println(emp1);
    	
    }
}
