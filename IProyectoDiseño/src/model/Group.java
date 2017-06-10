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
public class Group {
    private int groupNumber;
    private String period; 
    private boolean open; // no es mejor quitarlo? 
    private Employee professor; 
    private ArrayList<Schedule> schedules; 
    private Course course; // still quito el curso y lo hago un plan? 

    public Group(int number, String period, boolean open, Employee professor, ArrayList<Schedule> schedules, Course course) {
        this.groupNumber = number;
        this.period = period;
        this.open = open;
        this.professor = professor;
        this.schedules = schedules;
        this.course = course;
    }

    public int getNumber() {
        return groupNumber;
    }

    public void setNumber(int number) {
        this.groupNumber = number;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Employee getProfessor() {
        return professor;
    }

    public void setProfessor(Employee professor) {
        this.professor = professor;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Group{" + "numberGroup=" + groupNumber+ ", period=" + period + ", open=" + open + ", employee=" + professor + ", schedules=" + schedules + ", course=" + course + '}';
    }
    
    
    
    
}
