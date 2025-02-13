package com.wipro.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        // Load Hibernate Configuration
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("Hibernate setup successful!");
        session.close();
        factory.close();
    }
}
