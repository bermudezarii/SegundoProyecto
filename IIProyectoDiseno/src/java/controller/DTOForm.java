/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.EInconsistencie;
import model.ERequestState;

/**
 *
 * @author Ximena
 */
public class DTOForm {
    private Date date; 
    private String name; 
    private String email;
    private String phone;
    private String period; 
    private String codCourse;
    private int numGroup;
    private EInconsistencie inconsistence;
    private String nameStudent;
    private String note;
    private String requestId;
    private int requesterId;
    private String requesterName;
    private ERequestState state;
}
