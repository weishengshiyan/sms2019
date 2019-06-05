package com.briup.apps.app02.service.imp;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.dao.CourseMapper;
import com.briup.apps.app02.service.ICourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> query(Course course) {
        return courseMapper.query(course);
    }

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public void deleteCourse(Long id) {

        courseMapper.deleteCourse(id);

    }

    @Override
    public void saveAndupdata(Course course) {
        if (course.getId() == null) {
            courseMapper.insertCourse(course);
        } else {
            courseMapper.updataCourse(course);
        }


    }

    @Override
    public Course selectCourseById(Long id) {
        return courseMapper.selectCourseById(id);
    }
}


