/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.EInconsistencie;
import model.Parameter;
import model.Template;

/**
 *
 * @author Ximena
 */
public class RecordExclusionResolutionTemplate extends TemplateResolution {
    
    
    
    @Override
    public void templateMethod(String intro,String consider,String notify,String result,String resolve) {
        this.buildConsider(consider);
        this.buildIntro(intro);
        this.buildNotify(notify);
        this.buildResult(result);
        this.buildResolve(resolve);
        String num=Parameter.getInstance().getParameter("numTempl2");
        int sum = Integer.parseInt(num)+1;
        Parameter.getInstance().setParameter("numTempl2",Integer.toString(sum));
        Parameter.getInstance().saveParameters();

    }

    public RecordExclusionResolutionTemplate() {
        template=new Template();
        String num=Parameter.getInstance().getParameter("numTempl2");
        int sum = Integer.parseInt(num);
        template.setId(sum);
        template.setType(EInconsistencie.RecordExclusion);
    }

    @Override
    public void buildIntro(String intro) {   
        Parameter.getInstance().setParameter("introER"+Parameter.getInstance().getParameter("numTempl2"), intro);
        template.setIntro(intro);
    }
    @Override
    public void buildConsider(String consider) {
        Parameter.getInstance().setParameter("considerER"+Parameter.getInstance().getParameter("numTempl2"), consider);
        template.setConsider(consider);
    }

    @Override
    public void buildNotify(String notify) {
        Parameter.getInstance().setParameter("notifyER"+Parameter.getInstance().getParameter("numTempl2"), notify);
        template.setNotify(notify);
    }

    @Override
    public void buildResult(String result) {
        Parameter.getInstance().setParameter("resultER"+Parameter.getInstance().getParameter("numTempl2"), result);
        template.setResult(result);
    }
    @Override
    public void buildResolve(String resolve) {
          Parameter.getInstance().setParameter("resultER"+Parameter.getInstance().getParameter("numTempl2"), resolve);
          template.setResolve(resolve);
    }
}
