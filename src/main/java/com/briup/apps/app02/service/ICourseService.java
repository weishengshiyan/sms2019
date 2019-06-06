package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.User;
import com.briup.apps.app02.bean.extend.CourseExtends;

import java.util.List;

public interface ICourseService {
        List<Course>  query(Course course);
        List<Course> findAll();
        Course selectCourseById(Long id);
        void saveAndupdata(Course course) throws  Exception;

        void deleteCourse(Long id) throws Exception;

        List<CourseExtends> selectAll();


}
