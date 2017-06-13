/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Parameter;



/**
 *
 * @author Usuario
 */
public class GradeErrorResolutionBuilder extends ResolutionBuilder{

    @Override
    public void buildAttention() {
        resolution.setAttention(Parameter.getInstance().getParameter("attention"));
    }
    
    @Override
    public void buildTitle() {
        resolution.setTitle(Parameter.getInstance().getParameter("resolutionTitle"));
    }
    
    @Override
    public void buildIntro() {
        resolution.setIntro(Parameter.getInstance().getParameter("intro"));
    }

    @Override
    public void buildResult() {
        resolution.setResult(Parameter.getInstance().getParameter("result"));
    }

    @Override
    public void buildConsider() {
        resolution.setConsider(Parameter.getInstance().getParameter("consider"));
    }

    @Override
    public void buildResolve() {
        resolution.setResolve(Parameter.getInstance().getParameter("resolve"));
    }

    @Override
    public void buildNotify() {
        resolution.setNotify(Parameter.getInstance().getParameter("notify"));
    }
}
