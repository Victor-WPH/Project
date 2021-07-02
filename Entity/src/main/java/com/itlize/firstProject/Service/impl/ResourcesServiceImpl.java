package com.itlize.firstProject.Service.impl;


import com.itlize.firstProject.Entity.Resources;
import com.itlize.firstProject.Repository.ResourcesRepository;
import com.itlize.firstProject.Service.ResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ResourcesServiceImpl implements ResourceService {

    private final ResourcesRepository repository;

    public ResourcesServiceImpl(ResourcesRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initResource() {
        repository.saveAll(Stream.of(new Resources(005, LocalDate.of(2021,07,01), LocalDate.of(2021,07,02)))
                .collect(Collectors.toList()));
    }

    public List<Resources> getResource() {
        return repository.findAll();
    }
}

