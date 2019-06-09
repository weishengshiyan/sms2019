package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.extend.StudentCouserExtend;

import java.util.List;

public interface IStudentCourseExtendService {

    List<StudentCouserExtend> findAllByxk(String xk_name);

}
