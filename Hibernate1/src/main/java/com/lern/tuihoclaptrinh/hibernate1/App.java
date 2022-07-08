/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lern.tuihoclaptrinh.hibernate1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Tuan Anh
 */
public class App {
    public static void main(String[] args) {
        
        System.out.println("Project Started....");
        
        Configuration cfg = new Configuration();
        cfg.configure("com/hibernate/tuihoclaptrinh/config/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        
    }
}
