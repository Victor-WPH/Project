package com.itlize.firstProject.Repository;

import com.itlize.firstProject.Entity.Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourcesRepository extends JpaRepository<Resources, Integer> {

}
