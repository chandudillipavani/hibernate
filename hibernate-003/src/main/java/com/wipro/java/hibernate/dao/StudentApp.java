package com.wipro.java.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.java.hibernate.entities.Student;
import com.wipro.java.hibernate.utilities.HibernateUtil;

public class StudentApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student("Pavani", 136);
        Student student1 = new Student("devi", 146);
        Student student2 = new Student("Farheen", 131);
        session.persist(student);
        session.persist(student1);
        session.persist(student2);

        transaction.commit();
        session.close();
        System.out.println("Student record inserted successfully!");
    }
}