package com.itlize.firstProject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project_columns {
    @Id
    @GeneratedValue
    private int column_id;
    private int project_id;
    private String column_name;
    //private Enum type;
    private String formula_text;

    @OneToMany(mappedBy = "Project_columns")
    List<Project> list = new ArrayList<>();

    public Project_columns(int column_id, String column_name, String formula_text) {
        this.column_id = column_id;
        this.project_id = project_id;
        this.column_name = column_name;
        this.formula_text = formula_text;
    }

    public Project_columns() {

    }

    public int getColumn_id() {
        return column_id;
    }

    public void setColumn_id(int column_id) {
        this.column_id = column_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public String getFormula_text() {
        return formula_text;
    }

    public void setFormula_text(String formula_text) {
        this.formula_text = formula_text;
    }
}
