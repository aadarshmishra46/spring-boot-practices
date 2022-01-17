package com.springrest.springrest.services;

import com.springrest.springrest.controller.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CoursesService {
    List<Course> list;
    public CourseServiceImpl() {
        list=new ArrayList<>();
        list.add(new Course(145,"Java Core","this course content java basic"));
        list.add(new Course(146,"Java spring boot","this course content java spring boot basic"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }
}
