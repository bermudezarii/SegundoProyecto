/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.Course;
import model.Employee;
import model.Group;
import model.Request;
import model.Resolution;

/**
 *
 * @author Usuario
 */
public class School  {
    private static School INSTANCE;
    private IDocumentGenerator docGenerator; 
    private EmployeesManager employeesManager; 
    private RequestsManager requestsManager; 
    private PlansManager plansManager;
    private GroupsManager groupsManager;
    
    private DAOData getDataFile() {
        try {
            FileInputStream fis = new FileInputStream(new File("src//files//DatosProyecto1.xlsx"));
            return new DAOData(fis);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    
    private DAORequest getRequestsFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            return new DAORequest(fis);
        } catch(Exception ex) {
            System.out.println("Error from getRequest file");
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    
    public static synchronized School getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new School();
            INSTANCE.loadData();
        }
        
        return INSTANCE;
    }
    
    private void loadData() {
        DAOData data = getDataFile();
        DAORequest req = getRequestsFile("src//files//DatosFormulario.xlsx"); 
        employeesManager = new EmployeesManager(data);
        plansManager = new PlansManager(data);
        groupsManager = new GroupsManager(data);
        requestsManager = new RequestsManager(req);
        requestsManager.readSpreadSheet();
    }
    
    public void loadRequests(String path) {
        DAORequest data = getRequestsFile(path);
        requestsManager.setDAOData(data);
        requestsManager.readData();
    }
   
    public void insertRequest(DTORequest req) {
        requestsManager.insert(req);
    }
    
    public void editRequest(DTORequest req) {
        requestsManager.edit(req);
    }
    
    public void deleteRequest(String id) {
        requestsManager.delete(id);
    }
    
    public Request selectRequest(String id) {
        return (Request) requestsManager.select(id);
    }
    
    public ArrayList<Object> selectPendingRequests() {
        return requestsManager.selectPendings();
    }
    
    public ArrayList<Object> selectCanceledRequests() {
        return requestsManager.selectCanceled();
    }
    
    public ArrayList<Object> selectProcessedRequests() {
        return requestsManager.selectProcessed();
    }
    
    public ArrayList<Object> selectAllRequests() {
        return requestsManager.selectAll();
    }
    

    
    public ArrayList<Object> viewEmployees(){
        return employeesManager.elements; 
    }
    
    public Employee findEmployee(String id){
        return employeesManager.findEmployee(id);
    }
    
    public Course selectCourse(String id) {
        return plansManager.selectCourse("410", id); //Como por ahora es el unico que existe
    }
    
    public ArrayList<Course> selectAllCourses() {
        return plansManager.selectAllCourses("410");
    }
    
    
    
    public Group selectGroup(String period, int groupNumber, String courseCode) {
        //Se juntan para enviarlo buscar, ya que para buscar se recibe un
        //solo parametro
        String toSearch = period + "-" + groupNumber + "-" + courseCode;
        
        return (Group) groupsManager.select(toSearch);
    }
    
    public ArrayList<Object> selectAllGroups() {
        return groupsManager.selectAll();
    }
    
    
    
    
    public Resolution getResolution(){
        return requestsManager.getResolution();
    }
    
    public void setResolution(Resolution res) {
        requestsManager.setResolution(res);
    }
    
    public void createResolutionDoc(EDocType type) {
        Package pack = EDocType.class.getPackage();
        String creatorName = String.format("%s.%sGenerator", pack.getName(), type.name());
        
        try {
            docGenerator = (IDocumentGenerator) Class.forName(creatorName).newInstance();
            docGenerator.GenerateDocument(requestsManager.getResolution());
        } catch(Exception ex) {}
    }
    
   
    
    public ArrayList<Request> processedRequestsInDateRange(Date start, Date end) {
        return requestsManager.processedRequestsInDateRange(start, end);
    }
    
    public HashMap<Course, Integer> top5CoursesResolutionsByPeriod(String period){
        return requestsManager.top5CoursesResolutionsByPeriod(period);
    }
    
    public HashMap<Employee, Integer> top3ProfessorsResolutions() {
        return requestsManager.top3ProfessorsResolutions();
    }
 
    public void cancelRequest(String message){
        requestsManager.CancelRequest(message);
    }
    
    public void saveRequest() {
        requestsManager.saveRequest();
    }
    
    public void readSpreadSheet() {
        requestsManager.readSpreadSheet();
    }
}
