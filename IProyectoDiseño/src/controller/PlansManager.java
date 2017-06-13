/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Course;
import model.Plan;

/**
 *
 * @author ErickHdez
 */
public class PlansManager extends Manager {
    private DAOData data; 
 
    
    public PlansManager(DAOData data) {
        this.data = data;
        this.elements = new ArrayList<>();
        readData();
       
    }
    
    
    @Override
    public void insert(Object parameter) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Object parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object select(String id) {
        int planCode = Integer.parseInt(id);
        
        for(Object e : elements) {
            Plan p = (Plan) e;
            if(p.getCode() == planCode)
                return p;
        }
        
        return null;
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readData() {
        elements.add(data.readPlan());
        
    }
/*
    public void read() {
        elements.add(data.readPlan()); 
        System.out.println(elements.toString());
    }
*/
    
    public Course findCourse(String code){
        Plan plan = (Plan) elements.get(0);
        for (Course course : plan.getCourses()) {
            if(course.getCode().equals(code)){
                return course; 
            }
        }
        return null; 
    }
    
    public Course selectCourse(String planCode, String id) {
        Plan plan = (Plan) select(planCode);
        
        if(plan == null)
            return null;
        
        for(Course c : plan.getCourses()) {
            if(c.getCode().equals(id))
                return c;
        }
        
        return null;
    }
    
    public ArrayList<Course> selectAllCourses(String planCode) {
        Plan plan = (Plan) select(planCode);
        
        if(plan == null)
            return null;
        
        return plan.getCourses();
    }


}
