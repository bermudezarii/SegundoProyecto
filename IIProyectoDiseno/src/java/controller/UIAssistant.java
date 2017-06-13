/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Request;
import model.Resolution;
import view.FrResolution;
import view.FrViewRequest;

/**
 *
 * @author Ximena
 */
public class UIAssistant implements ObserverUI, UIBase{
        private FacadeAssistant facade; 
        private Resolution r; 
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
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
