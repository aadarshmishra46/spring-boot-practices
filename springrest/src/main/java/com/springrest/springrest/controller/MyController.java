package com.springrest.springrest.controller;

import com.springrest.springrest.controller.entity.Course;
import com.springrest.springrest.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CoursesService coursesService;

    @GetMapping("/home")
    public String home(){
        return "this is home page handle by controller";
    }
    //get the course
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.coursesService.getCourses();

    }
}
