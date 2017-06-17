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
import javax.swing.JOptionPane;
import model.Course;
import model.EInconsistencie;
import model.ERequestState;
import model.Employee;
import model.Group;
import model.Request;
import model.Resolution;
import org.apache.commons.validator.routines.EmailValidator;
import view.FrRequest;
import view.FrResolution;
import view.FrStadistics;
import view.FrViewRequest;
import org.jfree.data.category.DefaultCategoryDataset;
import view.FrTemplate;
import view.NewTemplate;

/**
 *
 * @author Ximena
 */
public class UICoordinator implements ObserverUI, UIBase{
    private FacadeCoordinator facade; 
    private DTORequest dtoRequest; 
    private Resolution r; 

    public UICoordinator() {
         facade= new FacadeCoordinator();
    }

    public FacadeCoordinator getFacade() {
        return facade;
    }

    public void setFacade(FacadeCoordinator facade) {
        this.facade = facade;
    }

    public DTORequest getDtoRequest() {
        return dtoRequest;
    }

    public void setDtoRequest(DTORequest dtoRequest) {
        this.dtoRequest = dtoRequest;
    }
 
    public void createRequest(FrRequest frrequest){
        Date date = new Date();
        dtoRequest=new DTORequest();
      
        String email=frrequest.getTxtemail().getText();
        String phone=frrequest.getTxtphone().getText();
        System.out.println(email);
        System.out.println(phone);
        if(EmailValidator.getInstance().isValid(email)&&phone.matches("\\d{4}[-\\.\\s]\\d{4}||\\d{8}")){
        dtoRequest.setCodCourse(frrequest.getCbcourse().getSelectedItem().toString());
        dtoRequest.setDate(date);
        dtoRequest.setDescription(frrequest.getTxtdescription().getText());
        dtoRequest.setEmail(frrequest.getTxtemail().getText());
        dtoRequest.setIdStudent(frrequest.getTxtcarne().getText());
        dtoRequest.setInconsistence(EInconsistencie.values()[frrequest.getCbcategory().getSelectedIndex()]);
        dtoRequest.setNameStudent(frrequest.getTxtname().getText());
        dtoRequest.setNumGroup(Integer.parseInt(frrequest.getCbgroup().getSelectedItem().toString()));
        dtoRequest.setPeriod(frrequest.getCbperiod().getSelectedItem().toString());
        dtoRequest.setPhone(frrequest.getTxtphone().getText());
        dtoRequest.setState(ERequestState.PENDING);
        dtoRequest.setRequesterId(frrequest.getTxtidr().getText());
        dtoRequest.setRequesterName(frrequest.getTxtnamer().getText());
        facade.createRequest(dtoRequest);
        JOptionPane.showMessageDialog(frrequest, "Se ha Creado Una Solicitud con Éxito.");
        FrRequest fr=new FrRequest();
        fr.setVisible(true);
        frrequest.setVisible(false);
        }else{
         JOptionPane.showMessageDialog(frrequest, "Se ha Ingresado un Correo o Número de Teléfono Inválido.");
        }
    }
    
    public void setallGroups(FrRequest frrequest){
        int i=0;
        if(frrequest.getCbgroup().getItemCount()!=0)
            frrequest.getCbgroup().removeAllItems();
        for(Object o:facade.selectallGroups()){
            String coursegroup=((Group)o).getCourse().getCode();
            String course=frrequest.getCbcourse().getSelectedItem().toString();
            if (course.equals(coursegroup)){
               
                frrequest.getLbNameCourse().setText(((Group)o).getCourse().getName());
                frrequest.getCbgroup().insertItemAt(Integer.toString(((Group)o).getNumber()), i);
                i++;}
        };
    }
    public void setallCourses(FrRequest frrequest){
        int i=0;
        for(Course c:facade.selectallCourses()){
            c.getCode();
            frrequest.getCbcourse().insertItemAt(c.getCode(), i);
            i++;
        };
    }
    public void setallPeriods(FrRequest frrequest){
        int i=0;
        ArrayList<String>periods=new ArrayList<String>();
        for(Object o:facade.selectallGroups()){
            if(!periods.contains(((Group)o).getPeriod())){
            frrequest.getCbperiod().insertItemAt(((Group)o).getPeriod(), i);  
            periods.add(((Group)o).getPeriod());
            i++;
            }
        
    }
    }
    public void setallRequest(FrViewRequest frviewrequest){
        frviewrequest.getLbCategory().setText("");
        frviewrequest.getLbcarne().setText("");
        frviewrequest.getLbcourse().setText("");
        frviewrequest.getLbdescription().setText("");
        frviewrequest.getLbemail().setText("");
        frviewrequest.getLbgroup().setText("");
        frviewrequest.getLbname().setText("");
        frviewrequest.getLbperiod().setText("");
        frviewrequest.getLbphone().setText("");
        frviewrequest.getLbnamer().setText("");
        frviewrequest.getLbcarner().setText("");
        frviewrequest.getTxtMotivo().setText("");
        int i=0;
        if(frviewrequest.getCdRequest().getItemCount()!=0){
            frviewrequest.getCdRequest().removeAllItems();
        }
        for (Object o:facade.selectTypeRequest(frviewrequest.getCbtyperequest().getSelectedIndex())){
            frviewrequest.getCdRequest().insertItemAt(Integer.toString(((Request)o).getId()), i);
            i++;
        }
  
        switch(frviewrequest.getCbtyperequest().getSelectedIndex()){
            case 0:
                frviewrequest.getLbmotivo().setVisible(true);
                frviewrequest.getBtncancel().setVisible(true);
                frviewrequest.getTxtMotivo().setVisible(true);
                frviewrequest.getSpmotivo().setVisible(true);
                frviewrequest.getTxtMotivo().setEditable(true);
                frviewrequest.getBtnNewResolution1().setVisible(true);
                frviewrequest.getBtnViewResolution().setVisible(false);
             
                break;
            case 1:
                frviewrequest.getLbmotivo().setVisible(false);
                frviewrequest.getBtncancel().setVisible(false);
                frviewrequest.getTxtMotivo().setVisible(false);
                frviewrequest.getSpmotivo().setVisible(false);
                frviewrequest.getBtnNewResolution1().setVisible(false);
                frviewrequest.getBtnViewResolution().setVisible(true);
                break;
            case 2:
                frviewrequest.getLbmotivo().setVisible(true);
                frviewrequest.getBtncancel().setVisible(false);
                frviewrequest.getTxtMotivo().setVisible(true);
                frviewrequest.getSpmotivo().setVisible(true);
                frviewrequest.getTxtMotivo().setEditable(false);
                frviewrequest.getBtnNewResolution1().setVisible(false);
                frviewrequest.getBtnViewResolution().setVisible(false);
                break;
                
                
            
        }

            
            
    }
     public void setRequest(FrViewRequest frviewrequest){
 
       if (frviewrequest.getCdRequest().getItemCount()!=0){
            Request r=facade.selectRequest(frviewrequest.getCdRequest().getSelectedItem().toString());
            switch(frviewrequest.getCbtyperequest().getSelectedIndex()){
                case 0:
                     frviewrequest.getLbCategory().setText(r.getInconsistencie().toString());
                     frviewrequest.getLbcarne().setText(r.getAffected().getId());
                     frviewrequest.getLbcourse().setText(r.getGroup().getCourse().getCode()+" "+r.getGroup().getCourse().getName());
                     frviewrequest.getLbdescription().setText(r.getDescription());
                     frviewrequest.getLbemail().setText(r.getAffected().getEmail());
                     frviewrequest.getLbgroup().setText(Integer.toString(r.getGroup().getNumber()));
                     frviewrequest.getLbname().setText(r.getAffected().getName());
                     frviewrequest.getLbperiod().setText(r.getGroup().getPeriod());
                     frviewrequest.getLbphone().setText(r.getAffected().getPhone());
                     frviewrequest.getLbnamer().setText(r.getRequester().getName());
                     frviewrequest.getLbcarner().setText(r.getRequester().getId());
                     break;
                case 1:

                     frviewrequest.getLbCategory().setText(r.getInconsistencie().toString());
                     frviewrequest.getLbcarne().setText(r.getAffected().getId());
                     frviewrequest.getLbcourse().setText(r.getGroup().getCourse().getCode()+" "+r.getGroup().getCourse().getName());
                     frviewrequest.getLbdescription().setText(r.getDescription());
                     frviewrequest.getLbemail().setText(r.getAffected().getEmail());
                     frviewrequest.getLbgroup().setText(Integer.toString(r.getGroup().getNumber()));
                     frviewrequest.getLbname().setText(r.getAffected().getName());
                     frviewrequest.getLbperiod().setText(r.getGroup().getPeriod());
                     frviewrequest.getLbphone().setText(r.getAffected().getPhone());
                     frviewrequest.getLbnamer().setText(r.getRequester().getName());
                     frviewrequest.getTxtMotivo().setEditable(true);
                     frviewrequest.getLbcarner().setText(r.getRequester().getId());
                     break;
                case 2:

                     frviewrequest.getLbCategory().setText(r.getInconsistencie().toString());
                     frviewrequest.getLbcarne().setText(r.getAffected().getId());
                     frviewrequest.getLbcourse().setText(r.getGroup().getCourse().getCode()+" "+r.getGroup().getCourse().getName());
                     frviewrequest.getLbdescription().setText(r.getDescription());
                     frviewrequest.getLbemail().setText(r.getAffected().getEmail());
                     frviewrequest.getLbgroup().setText(Integer.toString(r.getGroup().getNumber()));
                     frviewrequest.getLbname().setText(r.getAffected().getName());
                     frviewrequest.getLbperiod().setText(r.getGroup().getPeriod());
                     frviewrequest.getLbphone().setText(r.getAffected().getPhone());
                     frviewrequest.getLbnamer().setText(r.getRequester().getName());
                     frviewrequest.getLbcarner().setText(r.getRequester().getId());
                     frviewrequest.getTxtMotivo().setEditable(false);
                     frviewrequest.getTxtMotivo().setText(r.getNote().getDescription());
                   
                     break;

            }
      }
    }
    public void CancelRequest(FrViewRequest frviewrequest){
        facade.CancelRequest(frviewrequest.getTxtMotivo().getText());
        setallRequest(frviewrequest);
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
    
    
    
   


  
   
    public void createResolution(FrResolution frResolution)
    {
        
     
        r.setIntro(frResolution.getTxtintro().getText());
        r.setNotify(frResolution.getTxtnotify().getText());
        r.setResolve(frResolution.getTxtresolve().getText());
        r.setResult(frResolution.getTxtresult().getText());
        r.setConsider(frResolution.getTxtconsider().getText());
        r.setOneconsideration(frResolution.getChkconsider().isSelected());
        r.setOneresult(frResolution.getChkresult().isSelected());
        facade.createResolution(r);
        JOptionPane.showMessageDialog(frResolution, "Se ha creado una Resolución con Éxito.");
    }
    
    public void createResolutionDoc(EDocType type) {
        facade.createResolutionDoc(type);
    }
  
    public void getResolution(FrResolution frResolution) {
      r=facade.getResolution();
        if(r.isDefinitive()) {
            frResolution.getTxtintro().setEnabled(false);
            frResolution.getTxtnotify().setEnabled(false);
            frResolution.getTxtresolve().setEnabled(false);
            frResolution.getTxtresult().setEnabled(false);
            frResolution.getTxtconsider().setEnabled(false);
            frResolution.getBtnSave().setVisible(false);
            frResolution.getBtnSaveAs().setVisible(true);
            frResolution.getChkconsider().setVisible(false);
            frResolution.getChkresult().setVisible(false);
        }
        
       frResolution.getTxtintro().setText(r.getIntro());
       frResolution.getTxtnotify().setText(r.getNotify());
       frResolution.getTxtresolve().setText(r.getResolve());
       frResolution.getTxtresult().setText(r.getResult());
       frResolution.getTxtconsider().setText(r.getConsider());
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

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void createTemplate(NewTemplate frtemplate) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
         frtemplate.getCbtype().getSelectedIndex();
         System.out.println("Entroooo");
         switch  (frtemplate.getCbtype().getSelectedIndex()){
             case 0:
                 facade.createTemplate("RecordInclusion",frtemplate.getTxtintro().getText() , frtemplate.getTxtconsider().getText(),
                  frtemplate.getTxtresult().getText(), frtemplate.getTxtresolve().getText());
                 break;
             case 1:
                 facade.createTemplate("RecordExclusion",frtemplate.getTxtintro().getText() , frtemplate.getTxtconsider().getText(),
                  frtemplate.getTxtresult().getText(), frtemplate.getTxtresolve().getText());
                 break;
             default:
                 facade.createTemplate("GradeError",frtemplate.getTxtintro().getText() , frtemplate.getTxtconsider().getText(),
                  frtemplate.getTxtresult().getText(), frtemplate.getTxtresolve().getText());
                 break;
         
     }}
}
