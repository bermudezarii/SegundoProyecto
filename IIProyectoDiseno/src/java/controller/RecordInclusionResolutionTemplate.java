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
public class RecordInclusionResolutionTemplate extends TemplateResolution {

    public RecordInclusionResolutionTemplate() {
        template=new Template();
        String num=Parameter.getInstance().getParameter("numTempl1");
        int sum = Integer.parseInt(num);
        template.setId(sum);
        template.setType(EInconsistencie.RecordInclusion);
    }
    
    @Override
    public void templateMethod(String intro,String consider,String result,String resolve) {
        
        this.buildConsider(consider);
        this.buildIntro(intro);
        this.buildResult(result);
        this.buildResolve(resolve);
        String num=Parameter.getInstance().getParameter("numTempl1");
        int sum = Integer.parseInt(num)+1;
        Parameter.getInstance().setParameter("numTempl1",Integer.toString(sum));
        Parameter.getInstance().saveParameters();
    }

    @Override
    public void buildIntro(String intro) {
        Parameter.getInstance().setParameter("introIR"+Parameter.getInstance().getParameter("numTempl1"), intro);
        template.setIntro(intro);
    }

    @Override
    public void buildConsider(String consider) {
        Parameter.getInstance().setParameter("considerIR"+Parameter.getInstance().getParameter("numTempl1"),consider);
        template.setConsider(consider);
    }

 

    @Override
    public void buildResult(String result) {
        Parameter.getInstance().setParameter("considerIR"+Parameter.getInstance().getParameter("numTempl1"), result);

        template.setResult(result);
    }
    @Override
    public void buildResolve(String resolve) {
          Parameter.getInstance().setParameter("resultIR"+Parameter.getInstance().getParameter("numTempl1"), resolve);
          template.setResolve(resolve);
    }
}
