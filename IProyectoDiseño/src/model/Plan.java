/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Plan {
    
    private int code;  
    private int year;  
    private boolean active; 
    private ArrayList<Course> courses;

    public Plan(int code, int year, ArrayList<Course> courses) {
        this.code = code;
        this.year = year;
        this.courses = courses;
        this.active = true; 
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Plan{" + "code=" + code + ", year=" + year + ", active=" + active + ", courses=" + courses + '}';
    }
    
    
}
