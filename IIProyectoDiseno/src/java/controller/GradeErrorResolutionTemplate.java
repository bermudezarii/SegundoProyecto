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
public class GradeErrorResolutionTemplate extends TemplateResolution {

    @Override
    public void templateMethod(String intro,String consider,String notify,String result) {
        this.buildConsider(consider);
        this.buildIntro(intro);
        this.buildNotify(notify);
        this.buildResult(result);
        String num=Parameter.getInstance().getParameter("numTempl3");
        int sum = Integer.parseInt(num)+1;
        Parameter.getInstance().getParameter(Integer.toString(sum));

    }

    @Override
    public void buildIntro(String intro) {
        Parameter.getInstance().setParameter("introGER"+Parameter.getInstance().getParameter("numTempl3"), intro);

    }

    @Override
    public void buildConsider(String consider) {
        Parameter.getInstance().setParameter("considerGER"+Parameter.getInstance().getParameter("numTempl3"), consider);

    }

    @Override
    public void buildNotify(String notify) {
        Parameter.getInstance().setParameter("notifyGER"+Parameter.getInstance().getParameter("numTempl3"), notify);

    }

    @Override
    public void buildResult(String result) {
        Parameter.getInstance().setParameter("resultGER"+Parameter.getInstance().getParameter("numTempl3"), result);

    }
}
