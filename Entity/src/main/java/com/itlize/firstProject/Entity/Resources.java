package com.itlize.firstProject.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


@Entity
public class Resources {
    @Id
    @GeneratedValue
    private int resource_id;
    private LocalDate time_created;
    private LocalDate last_updated;

    @ManyToOne
    Project_Resources pr = new Project_Resources();

    @OneToMany
    List<Resource_Details> rd = new ArrayList<>();

    public Resources(int resource_id, LocalDate time_created, LocalDate last_updated) {
        this.resource_id = resource_id;
        this.time_created = time_created;
        this.last_updated = last_updated;
    }

    public Resources() {

    }

    public int getResource_id() {
        return resource_id;
    }

    public void setResource_id(int resource_id) {
        this.resource_id = resource_id;
    }

    public LocalDate getTime_created() {
        return time_created;
    }

    public void setTime_created(LocalDate time_created) {
        this.time_created = time_created;
    }

    public LocalDate getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(LocalDate last_updated) {
        this.last_updated = last_updated;
    }
}