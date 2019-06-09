package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.extend.StudentCouserExtend;
import com.briup.apps.app02.service.IStudentCourseExtendService;
import com.briup.apps.app02.utils.Message;
import com.briup.apps.app02.utils.MessagesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.MessageUtils;

import java.util.List;

@RestController
@RequestMapping("findAllByxk")
public class StudentCouserExtendController {


    @Autowired
    private IStudentCourseExtendService iStudentCourseExtendService;

    @GetMapping("findAllByxk")
    public Message findAllByxk(String xk_name){
        List<StudentCouserExtend> list = iStudentCourseExtendService.findAllByxk(xk_name);

        return MessagesUtils.success("success",list);

    }

}
