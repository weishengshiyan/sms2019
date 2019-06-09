package com.briup.apps.app02.service.imp;

import com.briup.apps.app02.bean.extend.StudentCouserExtend;
import com.briup.apps.app02.dao.extend.StudentCouserExtendMapper;
import com.briup.apps.app02.service.IStudentCourseExtendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IStudentCourseExtendServiceImpl  implements IStudentCourseExtendService {

    @Resource
    private StudentCouserExtendMapper studentCouserExtendMapper;


    @Override
    public List<StudentCouserExtend> findAllByxk(String xk_name) {


        return studentCouserExtendMapper.findAllByxk(xk_name);
    }
}
