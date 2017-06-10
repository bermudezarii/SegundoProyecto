/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Resolution;
import view.FrResolution;

/**
 *
 * @author Usuario
 */
public class UIResolution {
    private Resolution r; 
    private FacadeCoordinator facade; 


    public UIResolution() {
        facade=new FacadeCoordinator();
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
}
