/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import model.Course;
import model.Employee;
import model.Group;
import model.Request;
import org.jfree.data.category.DefaultCategoryDataset;
import view.FrStadistics;

/**
 *
 * @author Ximena
 */
public class UIHeadmaster implements  UIBase {
    private FacadeHeadMaster facade; 

    public UIHeadmaster() {
        facade=new FacadeHeadMaster();
    }

     public void processedRequestsInDateRange(FrStadistics frstadistics) {
        
        Date start=(Date) frstadistics.getSpInitialD().getValue();
        Date end=(Date) frstadistics.getSpFinalD().getValue();
        ArrayList<Request> r= facade.processedRequestsInDateRange(start, end);
        if (frstadistics.getCbResolutions().getItemCount()!=0){
            frstadistics.getCbResolutions().removeAllItems();
        }
        for(Request request: r){
            frstadistics.getCbResolutions().addItem(Integer.toString(request.getId()));
        }
    }
     public void getRequest(FrStadistics frstadistics){
         if(frstadistics.getCbResolutions().getItemCount()!=0){
            Request r=facade.selectRequest(frstadistics.getCbResolutions().getSelectedItem().toString());
            frstadistics.getLbcarne().setText(r.getAffected().getId());
            frstadistics.getLbcourse().setText(r.getGroup().getCourse().getCode()+" "+r.getGroup().getCourse().getName());
            frstadistics.getLbgroup().setText(Integer.toString(r.getGroup().getNumber()));
            frstadistics.getLbinconsistence().setText(r.getInconsistencie().toString());
            frstadistics.getLbname().setText(r.getAffected().getName());
            frstadistics.getLbresolution().setText(Integer.toString(r.getResolution().getId()));
            frstadistics.getLbperiod().setText(r.getGroup().getPeriod());
         }
     
     }
     public void setallPeriods(FrStadistics frstadistics){
        int i=0;
        ArrayList<String>periods=new ArrayList<String>();
        for(Object o:facade.selectallGroups()){
            if(!periods.contains(((Group)o).getPeriod())){
            frstadistics.getCbperiod().insertItemAt(((Group)o).getPeriod(), i);  
            periods.add(((Group)o).getPeriod());
            i++;
            }
        
    }
    }
     public DefaultCategoryDataset top5CoursesResolutionsByPeriod(FrStadistics frstadistics){
        HashMap<Course, Integer> c=facade.top5CoursesResolutionsByPeriod(frstadistics.getCbperiod().getSelectedItem().toString());
         DefaultCategoryDataset dataset=new DefaultCategoryDataset();
         
         for(Map.Entry<Course, Integer> course:c.entrySet()){
             dataset.setValue(course.getValue(), "", course.getKey().getName());
         }
         return dataset;
    }
      public DefaultCategoryDataset top3ProfessorsResolutions() {
        HashMap<Employee, Integer> e= facade.top3ProfessorsResolutions();
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        for(Map.Entry<Employee, Integer> employee:e.entrySet()){
            dataset.setValue(employee.getValue(), "", employee.getKey().getName());
        }
        return dataset;
    }
      public void loadfile(){
        JFileChooser jfc= new JFileChooser();
        jfc.setFileFilter(new FileTypeFilter(".xls","Excel"));
        jfc.setFileFilter(new FileTypeFilter(".xlsx","Excel"));
        jfc.setAcceptAllFileFilterUsed(false);
        File f=jfc.getSelectedFile();
        int result=jfc.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
           jfc.getSelectedFile().getPath();
           
           FacadeCoordinator facade= new FacadeCoordinator();
           facade.loadRequests( jfc.getSelectedFile().getPath());
        }
    }

    @Override
    public void setFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
