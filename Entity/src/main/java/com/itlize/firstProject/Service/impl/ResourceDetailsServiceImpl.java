package com.itlize.firstProject.Service.impl;

import com.itlize.firstProject.Entity.Project;
import com.itlize.firstProject.Entity.Resource_Details;
import com.itlize.firstProject.Repository.ProjectRepository;
import com.itlize.firstProject.Repository.Resource_DetailsRepository;
import com.itlize.firstProject.Service.ProjectService;
import com.itlize.firstProject.Service.ResourceDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ResourceDetailsServiceImpl implements ResourceDetailsService {

    private final Resource_DetailsRepository repository;

    public ResourceDetailsServiceImpl(Resource_DetailsRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProject() {
        repository.saveAll(Stream.of(new Resource_Details(007, LocalDate.of(2021,05,31), LocalDate.of(2021,06,30), 05, 50, 80))
                .collect(Collectors.toList()));
    }

    @Override
    public void initResourceDetails() {

    }

    public List<Resource_Details> getResourceDetails() {
        return repository.findAll();
    }
}

