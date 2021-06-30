package com.itlize.firstProject.Repository;

import com.itlize.firstProject.Entity.ProjectUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectUserRepository extends JpaRepository <ProjectUser, Integer> {

}
