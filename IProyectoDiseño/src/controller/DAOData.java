/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import model.Course;
import model.EDay;
import model.EEmployeeRol;
import model.Employee;
import model.Group;
import model.Plan;
import model.Schedule;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Usuario
 */
public class DAOData {
    FileInputStream FIS;
    XSSFWorkbook workbook; 

    public DAOData(FileInputStream FIS) throws IOException {
        this.FIS = FIS;
        this.workbook = new XSSFWorkbook(FIS); 
    }
   
    
    public Plan readPlan(){
        ArrayList<Course> courses = new ArrayList<>(); 
       //takes the sheet you ask for 
        XSSFSheet sheet = workbook.getSheet("PLAN"); 
               
        //for to go over the sheet info - like the rows 
        for(Row row : sheet){
            String code = null;
            String name = null;
            double credits = 0; 
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0: 
                            name = cell.getStringCellValue(); break; 
                        case 1: 
                            code = cell.getStringCellValue(); break; 
                        case 2: 
                            credits = cell.getNumericCellValue(); break; 
                    }
                }
                
            }
            if(code != null){
                Course course = new Course(code, name, credits);
             
                courses.add(course); 
            
                code = null ; name = null; credits = 0; 
            }
           
        }
        Plan plan = new Plan(410, 2010, courses); 
        return plan; 
    }
    
    
    public ArrayList<Employee> readProfessors(){
        ArrayList<Employee> employees = new ArrayList<>(); 
        //takes the sheet you ask for 
        XSSFSheet sheet = workbook.getSheet("PROFESORES"); 
        
        //for to go over the sheet info - like the rows 
        for(Row row : sheet){
            String id = null;
            String name = null;
            String email = null;
            String phone = null;
            String password = null; 
            EEmployeeRol rol = null; 
            
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    switch(cell.getColumnIndex()){
                        case 0: 
                            id = cell.getStringCellValue(); break; 
                        case 1: 
                            name = cell.getStringCellValue(); break; 
                        case 2: 
                            email = cell.getStringCellValue(); break; 
                        case 3: 
                            phone = cell.getStringCellValue(); break; 
                        case 4: 
                            password = cell.getStringCellValue(); break; 
                        case 5: 
                            rol = identifyEEmployeeRol(cell.getStringCellValue());   break; 
                    }
                }
                
            }
            if(id != null){
                employees.add(new Employee(rol, id, name, email, phone, password)); 
               
                id = null; name = null; email = null; phone = null; password = null; rol = null; 
            }
            
            
        }
        
        return employees;
    }
    
 
    private EEmployeeRol identifyEEmployeeRol(String rol) {
        switch (rol) {
            case "DIRECTOR":
                return EEmployeeRol.HEADMASTER;
            case "COORDINADOR":
                return EEmployeeRol.CORDINATOR;
            case "PROFESOR":
                return EEmployeeRol.PROFESSOR;
            case "ASISTENTE":
                return EEmployeeRol.ASSINTANT;
            case "SUPERUSUARIO":
                return EEmployeeRol.SUPERUSER;
            default: 
                break;
        }
        return null; 
    }
    
    /*
        Periodo	Curso	Grupo	Profesor	Horario	Aula
        IS2017	IC1802	1	5-5555-5555	K-J 7:30-9:20	B3-08
    */
    
    public EDay returnDay(char c){
        if (c == 'L'){
            return EDay.Monday; 
        }
        else if (c == 'K'){
            return EDay.Tuesday;
        }
        else if (c == 'M'){
            return EDay.Wednesday; 
        }
        else if (c == 'J'){
            return EDay.Thursday;
        }
        else if (c == 'V'){
            return EDay.Friday; 
        }
        else if (c == 'S'){
            return EDay.Saturday;
        }
        return null; 
    }
    
    public ArrayList<Schedule> identifySchedules(String schedule, String classroom){
        ArrayList<Schedule> schedules = new ArrayList<>(); 
        String[] items = schedule.split(" "); 
        String [] hours = items[1].split("-"); 
            
        String [] h1 = hours[0].split(":");
        String [] h2 = hours[1].split(":");
        if(schedule.charAt(1) == '-'){
            Schedule s1 = new Schedule(); 
            Schedule s2 = new Schedule(); 
            s1.setDay(returnDay(schedule.charAt(0)));
            s2.setDay(returnDay(schedule.charAt(2)));
                        
            s1.setStartHour(new Time(Integer.parseInt(h1[0]), Integer.parseInt(h1[1]), 0)); 
            s2.setStartHour(new Time(Integer.parseInt(h1[0]), Integer.parseInt(h1[1]), 0)); 
            
            s1.setEndHour(new Time(Integer.parseInt(h2[0]), Integer.parseInt(h2[1]), 0));
            s2.setEndHour(new Time(Integer.parseInt(h2[0]), Integer.parseInt(h2[1]), 0));
            
            s1.setClassRoom(classroom);
            s2.setClassRoom(classroom);
            
            schedules.add(s1); 
            schedules.add(s2); 
        }
        else{
            Schedule s1 = new Schedule(); 
            s1.setDay(returnDay(schedule.charAt(0)));
            
            s1.setStartHour(new Time(Integer.parseInt(h1[0]), Integer.parseInt(h1[1]), 0)); 
            s1.setEndHour(new Time(Integer.parseInt(h2[0]), Integer.parseInt(h2[1]), 0));
            
            s1.setClassRoom(classroom);
            schedules.add(s1); 
            
        }
        
        return schedules; 
    }
    
    public ArrayList<Object> readGroups() {
        ArrayList<Object> groups = new ArrayList(); 
        XSSFSheet sheet = workbook.getSheet("OFERTA");
        
        //for to go over the sheet info - like the rows 
        for(Row row : sheet){
            String period = null;
            Course course = null;
            int numberGroup = 0;
            Employee employee = null;
            ArrayList<Schedule> schedules = new ArrayList(); 
            String scheduleS = null; 
            String classroom = null; 
         
            for(Cell cell : row){
                if(row.getRowNum() != 0){
                    Schedule schedule = new Schedule(); 
                    switch(cell.getColumnIndex()){
                        case 0: 
                            period = cell.getStringCellValue(); break; 
                        case 1: 
                            course = School.getInstance().selectCourse(cell.getStringCellValue()); break;
                        case 2: 
                            numberGroup = (int) cell.getNumericCellValue();break; 
                        case 3: 
                            employee = School.getInstance().findEmployee(cell.getStringCellValue()); break; 
                        case 4: 
                            scheduleS = cell.getStringCellValue(); break; 
                        case 5: 
                            classroom = cell.getStringCellValue(); break; 
                       
                    }
                }
                
            }
            if(period != null){
                schedules = identifySchedules(scheduleS, classroom); 
                groups.add(new Group(numberGroup, period, true, employee, schedules, course)); 
             
                numberGroup = 0; 
                course = null; 
                period = null; 
                employee = null;  
                schedules = null; 
            }
      
            
        }
      
        return groups;
        
    }
}

   
    