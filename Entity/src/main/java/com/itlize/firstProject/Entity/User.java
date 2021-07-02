package com.itlize.firstProject.Entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class User {
    @Id
    @GeneratedValue
    private String user_name;
    private String title;
    private String role;
    private LocalDate time_created;
    private LocalDate last_updated;
    private String password;


    @ManyToOne
    Project project = new Project();

    public User(String user_name, String title, String role, LocalDate time_created, LocalDate last_updated, String password) {
        this.user_name = user_name;
        this.title = title;
        this.role = role;
        this.time_created = time_created;
        this.last_updated = last_updated;
        this.password = password;
    }

    public User() {

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}





