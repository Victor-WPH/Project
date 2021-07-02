package com.itlize.firstProject.Service.impl;

import com.itlize.firstProject.Entity.Project_Resources;
import com.itlize.firstProject.Repository.Project_ResourcesRepository;
import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.time.LocalDate;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest

public class Project_ResourcesImplTest {
    @Autowired
    Project_ResourcesRepository project_resourcesRepository;

    @BeforeClass
    @Test
    public void saveTest() {
        Project_Resources pr = new Project_Resources();
        pr.setRecord_id(005);
        pr.setTime_created(LocalDate.of(2021, 06, 28));
        pr.setProject_id(8);
        pr.setResource_id(007);

        Project_Resources res = project_resourcesRepository.save(pr);
        Assert.assertNotEquals(null, res);
    }
}

    //
    /*@Test
    public void findByrecord_id() {
        List<Project_Resources> res = Project_ResourcesRepository.findByrecord_Id(007);
        System.out.println(res);
        Assertions.assertNotEquals(null, res);
    }
}*/

    /*private int record_id;
    private LocalDate time_created;
    private int project_id;
    private int resource_id;*/
