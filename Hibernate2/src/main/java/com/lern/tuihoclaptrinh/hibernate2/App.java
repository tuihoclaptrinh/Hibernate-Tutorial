/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lern.tuihoclaptrinh.hibernate2;

import com.lern.tuihoclaptrinh.Models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tuan Anh
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Project started...");

        Configuration cfg = new Configuration();
        cfg.configure("com/hibernate/tuihoclaptrinh/config/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student s = new Student(1, "Tuihoclaptrinh", "Da Nang");
        Student s2 = new Student(2, "Tuihoclaptrinh2", "Da Nang 2");
        Student s3 = new Student(3, "Tuihoclaptrinh3", "Da Nang 3");

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(s2);
        session.save(s3);

        tx.commit();

        session.close();

    }
}
