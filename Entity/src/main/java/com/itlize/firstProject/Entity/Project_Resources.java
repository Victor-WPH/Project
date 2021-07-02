
package com.itlize.firstProject.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Project_Resources {
    @Id
    @GeneratedValue
    private int record_id;
    private LocalDate time_created;
    private int project_id;
    private int resource_id;

    @OneToMany(mappedBy = "Project_Resources")
    List<Project> list = new ArrayList<>();

    @OneToMany(mappedBy = "Project_Resources")
    List<Resources> list1 = new ArrayList<>();

    public Project_Resources(int record_id, LocalDate time_created, int project_id, int resource_id) {
    }

    public Project_Resources() {

    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public LocalDate getTime_created() {
        return time_created;
    }

    public void setTime_created(LocalDate time_created) {
        this.time_created = time_created;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getResource_id() {
        return resource_id;
    }

    public void setResource_id(int resource_id) {
        this.resource_id = resource_id;
    }
}

