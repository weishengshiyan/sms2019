package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.Course;

import java.util.List;

public interface CourseMapper {

    Course selectCourseById(Long id);
    List<Course> findAll();
    List<Course>  query(Course course);
    void insertCourse(Course course);
    void updataCourse(Course course);

    void deleteCourse(Long id);

}
