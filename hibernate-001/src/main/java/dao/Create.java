package dao;

import entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utilities.HibernateUtil;

public class Create {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            Employee emp = new Employee(101, "John");
            session.save(emp);

            t.commit();
            session.close();
            System.out.println("Data inserted successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
