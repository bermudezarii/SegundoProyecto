/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.jfree.data.category.DefaultCategoryDataset;
import view.FrStadistics;

/**
 *
 * @author coco
 */
public interface UIStadistics {
     public void processedRequestsInDateRange(FrStadistics frstadistics);
     public void getRequest(FrStadistics frstadistics);
     public void setallPeriods(FrStadistics frstadistics);
     public DefaultCategoryDataset top5CoursesResolutionsByPeriod(FrStadistics frstadistics);
     public DefaultCategoryDataset top3ProfessorsResolutions() ; 
    
}




