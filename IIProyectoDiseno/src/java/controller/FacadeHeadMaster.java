/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.Course;
import model.Employee;
import model.Request;

/**
 *
 * @author Ximena
 */
public class FacadeHeadMaster {
    private School school; 
    public ArrayList<Request> processedRequestsInDateRange(Date start, Date end) {
        return school.processedRequestsInDateRange(start, end);
    }
    
    public HashMap<Course,Integer> top5CoursesResolutionsByPeriod(String period){
        return school.top5CoursesResolutionsByPeriod(period);
    }
    public HashMap<Employee, Integer> top3ProfessorsResolutions() {
        return school.top3ProfessorsResolutions();
    }
     public ArrayList<Object> selectallGroups(){
        return school.selectAllGroups();
    }
      public Request selectRequest(String id){
        return school.selectRequest(id);
    }
}
