/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodoAppfpm.model;

import java.util.Date;

/**
 *
 * @author ty_jo
 */
public class Task {
    
    private int id;
    private int idProject;
    private String name;
    private String description;
    private boolean completedAt;
    private String notes;
    private Date deadline;
    private Date createdAt;
    private Date updateAt;

    public Task(int id, int idProject, String name, String description, boolean completedAt, String notes, Date deadline, Date createdAt, Date updateAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.completedAt = completedAt;
        this.notes = notes;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
    
    public Task (){
        this.createdAt = new Date();
        
    }

    public int getId() {
        return id;
    }

    public int getIdProject() {
        return idProject;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompletedAt() {
        return completedAt;
    }

    public String getNotes() {
        return notes;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "Tasks{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", completedAt=" + completedAt + ", notes=" + notes + ", deadline=" + deadline + ", crateAt=" + createdAt + ", updateAt=" + updateAt + '}';
    }
    
    
    
}
