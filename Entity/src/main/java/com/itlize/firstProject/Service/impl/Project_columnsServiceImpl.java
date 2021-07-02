package com.itlize.firstProject.Service.impl;


import com.itlize.firstProject.Entity.Project_Resources;
import com.itlize.firstProject.Entity.Project_columns;
import com.itlize.firstProject.Repository.Project_columnsRepository;
import com.itlize.firstProject.Service.Project_columnsService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Project_columnsServiceImpl implements Project_columnsService {
    private final Project_columnsRepository repository;

    public Project_columnsServiceImpl(Project_columnsRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProject_columns() {
        repository.saveAll(Stream.of(new Project_columns(00100, "columnA", "formulaB"))
                .collect(Collectors.toList()));
    }

    public List<Project_columns> getProject_columns() {
        return repository.findAll();
    }
}


