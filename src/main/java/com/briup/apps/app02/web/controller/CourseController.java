package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.service.ICourseService;
import com.briup.apps.app02.service.imp.CourseServiceImpl;
import com.briup.apps.app02.utils.Message;
import com.briup.apps.app02.utils.MessagesUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    private ICourseService courseService;


    @GetMapping("/selectCourseById")
    public Message selectCourseById(Long id){
        Course course = courseService.selectCourseById(id);

        return MessagesUtils.success("success",course);

    }

    @GetMapping("/saveAndupdata")
    public Message saveAndupdata(Course course) throws  Exception
    {
        courseService.saveAndupdata(course);
       return    MessagesUtils.success("success");

    }
    @GetMapping("query")
    public Message query( Course course){
        List<Course> list = courseService.query(course);
        return MessagesUtils.success("success",list);

    }
    @GetMapping("findAll")
    public Message findAll(){
        List<Course> list = courseService.findAll();
        return  MessagesUtils.success("success",list);


    }
    @GetMapping("/deleteCourse")
    public Message deleteCourse(Long id) throws  Exception{
        courseService.deleteCourse(id);
        return  MessagesUtils.success("success");

    }





}
