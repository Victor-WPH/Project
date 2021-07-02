package com.itlize.firstProject.Service;

import com.itlize.firstProject.Entity.Resource_Details;
import com.itlize.firstProject.Entity.User;

import java.util.List;

public interface ResourceDetailsService {
    public void initResourceDetails();
    public List<Resource_Details> getResourceDetails();
}
