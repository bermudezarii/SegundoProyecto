/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import model.Course;
import static model.ERequestState.*;
import model.Employee;
import model.Group;
import model.Person;
import model.Request;
import model.Resolution;
import model.Student;

/**
 *
 * @author Usuario
 */
public final class RequestsManager extends Manager {
    private Request currentRequest;
    private DAORequest data; 
    
    public RequestsManager(DAORequest dao) {
        elements = new ArrayList();
        data = dao; 
        currentRequest = null;
        readData();
    }

    @Override
    public void insert(Object parameter) {
        System.out.println("insert de request manager, lo que le entra: "+ parameter.toString());
        DTORequest dto = (DTORequest) parameter;
        System.out.println("lo que cambia a dto:" + dto.toString());
        Group group = School.getInstance().selectGroup(dto.getPeriod(), 
                        dto.getNumGroup(), dto.getCodCourse());
        System.out.println("grupo que identifica: " + group.toString());
        Student student = new Student(dto.getIdStudent(), dto.getNameStudent(),
                                      dto.getEmail(), dto.getPhone());
        System.out.println("estudiante que agarra: " + student.toString());
        Person requester = new Person(dto.getRequesterId(), dto.getRequesterName(), "", "");
        System.out.println("persona que solicita: " + requester.toString());
        currentRequest = new Request(dto.getDate(), dto.getDescription(), 
                                     dto.getInconsistence(), null, student, requester,
                                     group);
        System.out.println("el nuevo request seria: " + currentRequest.toString());
        
        elements.add(currentRequest);
        System.out.println("si lo anade");
        saveRequest();
    }

    @Override
    public void edit(Object parameter) {
        DTORequest dto = (DTORequest) parameter;
        Request temp = new Request();
        temp.setId(dto.getRequestId());
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                temp = (Request) r;
                temp.setRequestState(dto.getState());
                
                if(temp.getRequestState() == CANCELED)
                    temp.setNote(dto.getNote());
                
                return;
            }
        }
    }

    @Override
    public void delete(String id) {
        Request temp = new Request();
        temp.setId(Integer.parseInt(id));
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                elements.remove(r);
                
                return;
            }
        }
    }

    @Override
    public Object select(String id) {
        Request temp = new Request();
        temp.setId(Integer.parseInt(id));
        
        for(Object r : elements) {
            if(temp.equals(r)) {
                currentRequest = (Request) r;
                return r;
            }
        }
        
        return null;
    }
    
    public ArrayList<Object> selectPendings() {
        ArrayList<Object> pendings = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == PENDING)
                pendings.add(r);
        }
        
        return pendings;
    }
    
    public ArrayList<Object> selectCanceled() {
        ArrayList<Object> canceled = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == CANCELED)
                canceled.add(r);
        }
        
        return canceled;
    }
    
    public ArrayList<Object> selectProcessed() {
        ArrayList<Object> processed = new ArrayList();
        
        for(Object r : elements) {
            if(((Request) r).getRequestState() == PROCESSED)
                processed.add(r);
        }
        
        return processed;
    }

    @Override
    public ArrayList<Object> selectAll() {
        return elements;
    }
    
    public Resolution getResolution() {
        if(currentRequest.getResolution() == null)
            return currentRequest.createTemplateResolution();
        
        return currentRequest.getResolution();
    }
    
    public void setResolution(Resolution res) {
        
        SendMail sendmail=new SendMail();
        ConcreteCommandMail ccm=new ConcreteCommandMail(sendmail);
        Invoker invoker=new Invoker();
        
        currentRequest.setRequestState(PROCESSED);
        res.setDefinitive(true);
        currentRequest.setResolution(res);
        saveRequest();
      String subject="SOLICITUD "+ currentRequest.getInconsistencie()
             +currentRequest.getId()+": ACEPTADA";
      
      String info="Saludos Cordiales,\nSe le informa, que se ha tramitado la solicitud sobre " +currentRequest.getInconsistencie()+"del alumno "+
              currentRequest.getAffected().getName()+",con identificación " +currentRequest.getAffected().getId()+
              ", en el curso "+currentRequest.getGroup().getCourse().getCode()+" "+currentRequest.getGroup().getCourse().getName()
              +" con el profesor "+ currentRequest.getGroup().getProfessor().getName()+".";
      
      ccm.setMail(currentRequest.getAffected().getEmail());
      ccm.setSubject(subject);
      ccm.setInfo(info);
      invoker.placeCommand(ccm);
    }
    
    public void setDAOData(DAORequest data) {
        this.data = data;
    }

    @Override
    public void readData() {
        elements.addAll(data.readRequests());
    }
    
    public void CancelRequest(String message){
       SendMail sendmail=new SendMail();
        ConcreteCommandMail ccm=new ConcreteCommandMail(sendmail);
        Invoker invoker=new Invoker();
      currentRequest.setRequestState(CANCELED);
      currentRequest.setNote(message);
      saveRequest();
      String subject="SOLICITUD "+ currentRequest.getInconsistencie()
             +currentRequest.getId()+": NO ACEPTADA";
      String info="Saludos Cordiales,\nSe le informa, que se le ha denegado la solicitud sobre " +currentRequest.getInconsistencie()+"del alumno "+
              currentRequest.getAffected().getName()+",con identificación " +currentRequest.getAffected().getId()+
              ", en el curso "+currentRequest.getGroup().getCourse().getCode()+" "+currentRequest.getGroup().getCourse().getName()
              +" con el profesor "+ currentRequest.getGroup().getProfessor().getName() +".\n Por el siguiente motivo:\n"+message;
      ccm.setMail(currentRequest.getAffected().getEmail());
      ccm.setSubject(subject);
      ccm.setInfo(info);
      invoker.placeCommand(ccm);
    }
    
    public ArrayList<Request> processedRequestsInDateRange(Date start, Date end) {
        ArrayList<Request> processed = new ArrayList();
        Request r;
        
        for(Object o : selectProcessed()) {
            r = (Request) o;
            
            if(r.getDate().after(start) && r.getDate().before(end))
                processed.add(r);
        }
        
        return processed;
    }
    
    public HashMap<Course, Integer> top5CoursesResolutionsByPeriod(String period) {
        HashMap<Course, Integer> courses = new HashMap();
        Request r;
        Course c;
        
        for(Object o : selectProcessed()) {
            r = (Request) o;
            
            if(r.getGroup().getPeriod().equals(period)) {
                c = r.getGroup().getCourse();
                
                if(courses.containsKey(c))
                    courses.put(c, courses.get(c) + 1);
                else
                    courses.put(c, 1);
            }
        }
        
        return filterTop5Courses(courses);
    }
    
    private HashMap<Course, Integer> filterTop5Courses(HashMap<Course, Integer> courses) {
        HashMap<Course, Integer> top5 = new HashMap();
        
        for(Map.Entry<Course, Integer> oentry : courses.entrySet()) {
            if(top5.size() <= 5) {
                top5.put(oentry.getKey(), oentry.getValue());
            } else {
                for(Map.Entry<Course, Integer> ientry : top5.entrySet()) {
                    if(oentry.getValue() > ientry.getValue()) {
                        top5.remove(ientry.getKey());
                        top5.put(oentry.getKey(), oentry.getValue());
                    }
                }
            }
        }
        
        return top5;
    }
    
    public HashMap<Employee, Integer> top3ProfessorsResolutions() {
        HashMap<Employee, Integer> professors = new HashMap();
        Request r;
        Employee e;
        
        for(Object o : selectProcessed()) {
            r = (Request) o;
            e = r.getGroup().getProfessor();
                
            if(professors.containsKey(e))
                professors.put(e, professors.get(e) + 1);
            else
                professors.put(e, 1);
        }
        
        return filterTop3Professors(professors);
    }
    
    private HashMap<Employee, Integer> filterTop3Professors(HashMap<Employee, Integer> professors) {
        HashMap<Employee, Integer> top3 = new HashMap();
        
        for(Map.Entry<Employee, Integer> oentry : professors.entrySet()) {
            if(top3.size() <= 3) {
                top3.put(oentry.getKey(), oentry.getValue());
            } else {
                for(Map.Entry<Employee, Integer> ientry : top3.entrySet()) {
                    if(oentry.getValue() > ientry.getValue()) {
                        top3.remove(ientry.getKey());
                        top3.put(oentry.getKey(), oentry.getValue());
                    }
                }
            }
        }
        
        return top3;
    }

    public void saveRequest() {

        data.saveRequest();

    }
}
