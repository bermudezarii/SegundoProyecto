/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */


   

public class Course {
    private String name;
    private String code; 
    private double credits;

    public Course(String name, String code, double credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object obj) {
        return code.equals(((Course) obj).getCode());
    }
    
    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", code=" + code + ", credits=" + credits + '}';
    }
    
    
    
    
}
