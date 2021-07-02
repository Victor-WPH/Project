package com.itlize.firstProject.Repository;

import com.itlize.firstProject.Entity.Project_Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Project_ResourcesRepository extends JpaRepository<Project_Resources, Long> {



}





