package com.itlize.firstProject.Service.impl;


import com.itlize.firstProject.Entity.Project_Resources;
import com.itlize.firstProject.Repository.Project_ResourcesRepository;
import com.itlize.firstProject.Service.ProjectResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Project_ResourcesServiceImpl implements ProjectResourceService {

    private final Project_ResourcesRepository repository;

    public Project_ResourcesServiceImpl(Project_ResourcesRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProjectResource() {
        repository.saveAll(Stream.of(new Project_Resources(00100, LocalDate.of(2021,06,30), 1, 101))
                .collect(Collectors.toList()));
    }

    public List<Project_Resources> getProjectResource() {
        return repository.findAll();
    }
}

/*
    private int record_id;
    private LocalDate time_created;
    private int project_id;
    private int resource_id;*/
