/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DirectorResolution;
import controller.ResolutionBuilder;
import java.io.File;
import java.util.Date;
import static model.ERequestState.PENDING;

/**
 *
 * @author Usuario
 */
public class Request {
    private static int REQUESTS_SERIAL = 1;
    
    private int id; 
    private Date date; 
    private String description; 
    private File evidence; 
    private EInconsistencie inconsistencie; 
    private ERequestState requestState; 
    private Note note; 
    private Resolution resolution;
    private Student affected;
    private Person requester;
    private Group group;
    
    public Request() {}

    public Request(Date date, String description, EInconsistencie inconsistencie, 
                   ERequestState state, Student affected, Person requester, Group group) {
        
        this.id = REQUESTS_SERIAL++;
        this.date = date;
        this.description = description;
        this.inconsistencie = inconsistencie;
        this.requestState = state == null ? PENDING : state;
        this.affected = affected;
        this.requester = requester;
        this.group = group;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public File getEvidence() {
        return evidence;
    }

    public void setEvidence(File evidence) {
        this.evidence = evidence;
    }

    public EInconsistencie getInconsistencie() {
        return inconsistencie;
    }

    public void setInconsistencie(EInconsistencie inconsistencie) {
        this.inconsistencie = inconsistencie;
    }

    public ERequestState getRequestState() {
        return requestState;
    }

    public void setRequestState(ERequestState requestState) {
        this.requestState = requestState;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(String message) {
        this.note = new Note(message);
    }

    public Resolution getResolution() {
        return resolution;
    }
    
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Resolution createTemplateResolution() {
        setResolutionParameters();
        
        Package pack = ResolutionBuilder.class.getPackage();
        String builder = String.format("%s.%sResolutionBuilder", pack.getName(), 
                                       this.inconsistencie.name());
        DirectorResolution dir = new DirectorResolution();
        
        try {
            ResolutionBuilder rb = (ResolutionBuilder) Class.forName(builder).newInstance();
            dir.setResolutionBuilder(rb);
            dir.buildResolution();
            return dir.getResolution();
        } catch(Exception ex) {}
        
        return null;
    }
    
    private void setResolutionParameters() {
        Parameter prop = Parameter.getInstance();
        
        prop.setParameter("studentName", this.affected.getName().toUpperCase());
        prop.setParameter("studentCarne", this.affected.getId().toUpperCase());
        prop.setParameter("courseCode", this.group.getCourse().getCode().toUpperCase());
        prop.setParameter("courseName", this.group.getCourse().getName().toUpperCase());
        prop.setParameter("groupNumber", String.valueOf(this.group.getNumber()).toUpperCase());
        prop.setParameter("professor", this.group.getProfessor().getName().toUpperCase());
        
        prop.saveParameters();
    }

    public Student getAffected() {
        return affected;
    }

    public void setAffected(Student affected) {
        this.affected = affected;
    }

    public Person getRequester() {
        return requester;
    }

    public void setRequester(Person requester) {
        this.requester = requester;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Request) obj).getId();
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", date=" + date + ", description=" + description + ", evidence=" + evidence + ", inconsistencie=" + inconsistencie + ", requestState=" + requestState + ", note=" + note + ", resolution=" + resolution + ", affected=" + affected + ", requester=" + requester + ", group=" + group + '}';
    }
    
    
}
