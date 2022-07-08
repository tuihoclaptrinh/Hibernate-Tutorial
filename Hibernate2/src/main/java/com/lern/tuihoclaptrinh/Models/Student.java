/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lern.tuihoclaptrinh.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Tuan Anh
 */
@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private String city;

    public Student() {
    }

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", city=" + city + '}';
    }

}
