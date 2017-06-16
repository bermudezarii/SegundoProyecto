/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.Parameter;

/**
 *
 * @author Ximena
 */
public class RecordExclusionResolutionTemplate extends TemplateResolution {
    @Override
    public void templateMethod(String intro,String consider,String notify,String result) {
        this.buildConsider(consider);
        this.buildIntro(intro);
        this.buildNotify(notify);
        this.buildResult(result);
        String num=Parameter.getInstance().getParameter("numTempl2");
        int sum = Integer.parseInt(num)+1;
        Parameter.getInstance().getParameter(Integer.toString(sum));

    }

    @Override
    public void buildIntro(String intro) {   
        Parameter.getInstance().setParameter("introER"+Parameter.getInstance().getParameter("numTempl2"), intro);
     }
    @Override
    public void buildConsider(String consider) {
        Parameter.getInstance().setParameter("considerER"+Parameter.getInstance().getParameter("numTempl2"), consider);
    }

    @Override
    public void buildNotify(String notify) {
        Parameter.getInstance().setParameter("notifyER"+Parameter.getInstance().getParameter("numTempl2"), notify);
    }

    @Override
    public void buildResult(String result) {
        Parameter.getInstance().setParameter("resultER"+Parameter.getInstance().getParameter("numTempl2"), result);
    }
    
}
