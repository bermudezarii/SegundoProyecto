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
import model.EInconsistencie;
import model.Employee;
import model.Parameter;
import model.Request;
import model.Resolution;
import model.Template;

/**
 *
 * @author Usuario
 */
public class FacadeCoordinator {
    private School school;
    private ExtendedSchool extendedSchool;

    public FacadeCoordinator() {
        school= School.getInstance();
        extendedSchool=ExtendedSchool.getInstance();
    }
    
    public void createRequest(DTORequest dtoRequest) {
        school.insertRequest(dtoRequest);
    }
    public void createResolution(Resolution res){
        school.setResolution(res);
    }
    public void createResolutionDoc(EDocType type) {
        school.createResolutionDoc(type);
    }
    
    public ArrayList<Object> selectallGroups(){
        return school.selectAllGroups();
    }
    public ArrayList<Course> selectallCourses(){
        return school.selectAllCourses();
    }
    public ArrayList<Object> selectallRequest(){
        return school.selectAllRequests();
    }
    public Request selectRequest(String id){
        return school.selectRequest(id);
    }
    
    public ArrayList<Object> selectTypeRequest(int type){
        switch (type){
            case 0:
               return school.selectPendingRequests();
            case 1:
               return school.selectProcessedRequests();
            case 2:
               return school.selectCanceledRequests();
        
        }
                
        return null;
    }
    public void CancelRequest(String message){
        school.cancelRequest(message);
    }
    
    public Resolution getResolution() {
        return school.getResolution();
    }
    public ArrayList<Request> processedRequestsInDateRange(Date start, Date end) {
        return school.processedRequestsInDateRange(start, end);
    }
    
    public HashMap<Course,Integer> top5CoursesResolutionsByPeriod(String period){
        return school.top5CoursesResolutionsByPeriod(period);
    }
    public HashMap<Employee, Integer> top3ProfessorsResolutions() {
        return school.top3ProfessorsResolutions();
    }
    public void loadRequests(String path) {
        System.out.println("profes: " + school.selectAllEmployee().toString());
        System.out.println("cursos" + school.selectAllCourses().toString());
        System.out.println("grupos" + school.selectAllGroups().toString());
        System.out.println("requests" + school.selectAllRequests().toString());
        school.loadRequests(path);
   
    }
    public void createTemplate(String type,String intro,String consider,String result,String resolve) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        extendedSchool.createTemplate(type, intro, consider, result, resolve);
    }
    
    public int selectTemplates(int type){
        
        return extendedSchool.selectTemplates(type);
        
    }
    public Template getTemplate(int id, String type){
     
        
        return extendedSchool.getTemplate(id, type);
    }
    

}
