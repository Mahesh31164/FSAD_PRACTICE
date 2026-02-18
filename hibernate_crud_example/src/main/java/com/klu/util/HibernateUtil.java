package com.klu.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.klu.Student;

public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
