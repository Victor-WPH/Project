
package com.itlize.firstProject.Entity;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Project{
    @Id
    @GeneratedValue
    private int project_id;
    private LocalDate time_created;
    private String owner;

    @OneToMany(mappedBy = "project")
    List<User> list = new ArrayList<>();
    @ManyToOne
    Project_columns pc = new Project_columns();
    @ManyToOne
    Project_Resources pr = new Project_Resources();

    public Project() {
    }

    public Project(LocalDate time_created, String owner) {
        this.time_created = time_created;
        this.owner = owner;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public LocalDate getTime_created() {
        return time_created;
    }

    public void setTime_created(LocalDate time_created) {
        this.time_created = time_created;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Project(int project_id, LocalDate time_created, String owner) {
        this.project_id = project_id;
        this.time_created = time_created;
        this.owner = owner;
    }

}



