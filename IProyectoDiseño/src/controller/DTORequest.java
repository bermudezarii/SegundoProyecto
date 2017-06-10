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
 * @author Usuario
 */
public class DTORequest {
    private int requestId;
    private Date date;
    private String requesterId;
    private String requesterName;
    private String period;
    private String codCourse;
    private int numGroup;
    private String idStudent;
    private String nameStudent;
    private String phone;
    private String email;
    private ERequestState state;
    private EInconsistencie inconsistence;
    private String description;
    private String note;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCodCourse() {
        return codCourse;
    }

    public void setCodCourse(String codCourse) {
        this.codCourse = codCourse;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ERequestState getState() {
        return state;
    }

    public void setState(ERequestState state) {
        this.state = state;
    }

    public EInconsistencie getInconsistence() {
        return inconsistence;
    }

    public void setInconsistence(EInconsistencie inconsistence) {
        this.inconsistence = inconsistence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
