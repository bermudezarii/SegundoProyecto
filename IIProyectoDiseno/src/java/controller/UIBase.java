/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JTextArea;
import org.jfree.data.category.DefaultCategoryDataset;
import view.FrRequest;
import view.FrResolution;
import view.FrStadistics;
import view.FrTemplate;
import view.FrViewRequest;
import view.NewTemplate;

/**
 *
 * @author Ximena
 */
public interface UIBase {
    public void setMenu(); 
    
    public Object getFacade();

    public void setFacade(Object facade);

    public DTORequest getDtoRequest();

    public void setDtoRequest(DTORequest dtoRequest);
 
    public void createRequest(FrRequest frrequest); 
    
    public void setallGroups(FrRequest frrequest); 
    
    public void setallCourses(FrRequest frrequest);
    
    public void setallPeriods(FrRequest frrequest); 
    
    public void setallRequest(FrViewRequest frviewrequest);
    
    public void setRequest(FrViewRequest frviewrequest);
     
    public void CancelRequest(FrViewRequest frviewrequest);
    
    public void loadfile();
   
    public void createResolution(FrResolution frResolution);
    
    public void createResolutionDoc(EDocType type);
  
    public void getResolution(FrResolution frResolution);

    public void processedRequestsInDateRange(FrStadistics frstadistics);
     
    public void getRequest(FrStadistics frstadistics);
     
    public void setallPeriods(FrStadistics frstadistics);
     
    public DefaultCategoryDataset top5CoursesResolutionsByPeriod(FrStadistics frstadistics);
     
    public DefaultCategoryDataset top3ProfessorsResolutions();
    
    public void createTemplate(NewTemplate frtemplate)throws ClassNotFoundException, InstantiationException, IllegalAccessException;
     
    public void insertParam(JTextArea txt, int num);
    
    public void selectTemplates(FrTemplate template);
    
    public void getTemplate(FrTemplate template);

}
