/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.SendMail;

/**
 *
 * @author ximeb
 */
public class ConcreteCommandMail implements Command{
    private String mail, subject, info;
    private SendMail sendmail;
   

    public ConcreteCommandMail(SendMail mail) {
        this.sendmail = mail;
    }
    
    @Override
    public void execute() {
        sendmail.send(mail,subject ,info, "correo.informativo.xbf@gmail.com", "12345678A");
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    
}
