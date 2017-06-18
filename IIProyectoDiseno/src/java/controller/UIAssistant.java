/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import model.Request;
import model.Resolution;
import org.jfree.data.category.DefaultCategoryDataset;
import view.FrMain;
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
public class UIAssistant implements ObserverUI, UIBase, UIViewRequest{
    private FacadeAssistant facade; 
    private Resolution r; 

    public UIAssistant() {
        this.facade = new FacadeAssistant();
    }
        

    @Override
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


    @Override
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


    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMenu(JFrame frame) {
        if(frame instanceof FrMain){
            FrMain fr = (FrMain) frame; 
            fr.getBtnExel().setVisible(false);
            fr.getBtnNewRequest().setVisible(false);
            fr.getBtnViewRequest().setVisible(true);
            fr.getBtnviewStadistics().setVisible(false);
        
        }
        else if(frame instanceof FrResolution){
            FrResolution fr = (FrResolution) frame; 
            fr.getBtnSave().setVisible(false);
            fr.getBtnSaveAs().setVisible(false);
            fr.getBtnNewRequest().setVisible(false);
            fr.getBtnViewRequest().setVisible(true);
            fr.getBtnviewStadistics().setVisible(false);
            
        }
        else if(frame instanceof FrViewRequest){
            FrViewRequest fr = (FrViewRequest) frame; 
            
            
            fr.getBtncancel().setEnabled(false);
            fr.getBtncancel().setVisible(false);
            fr.getTxtMotivo().setEditable(false);
            fr.getTxtMotivo().setEnabled(false);
            fr.getLbdescription().setEditable(false);
            fr.getLbdescription().setEnabled(false);
            System.out.println("desaparecer");
            fr.getBtnNewResolution().setVisible(false);
            fr.getBtnNewResolution().setEnabled(false);
            fr.getBtnNewResolution1().setEnabled(false);
            fr.getBtnNewResolution1().setVisible(false);
            fr.getjMenu5().setVisible(false);
            System.out.println("desaparecer1");
            fr.getBtnNewRequest().setVisible(false);
            fr.getBtnNewRequest1().setVisible(false);
            fr.getBtnViewRequest().setVisible(true);
            fr.getBtnViewRequest1().setVisible(true);
            fr.getBtnViewResolution().setVisible(true);
            fr.getBtnviewStadistics().setVisible(false);
        }
        
      
             
        
    
    }
}
