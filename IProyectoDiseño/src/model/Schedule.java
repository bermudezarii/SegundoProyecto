/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author Usuario
 */
public class Schedule {
    private EDay day; 
    private Time startHour; 
    private Time endHour; 
    private String classRoom; 

    public Schedule() {
    }

    public EDay getDay() {
        return day;
    }

    public void setDay(EDay day) {
        this.day = day;
    }

    public Time getStartHour() {
        return startHour;
    }

    public void setStartHour(Time startHour) {
        this.startHour = startHour;
    }

    public Time getEndHour() {
        return endHour;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Schedule{" + "day=" + day + ", startHour=" + startHour + ", endHour=" + endHour + ", classRoom=" + classRoom + '}';
    }
    
    
    
}
