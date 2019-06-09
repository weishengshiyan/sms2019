package com.briup.apps.app02.dao.extend;

import com.briup.apps.app02.bean.extend.StudentCouserExtend;

import java.util.List;

public interface StudentCouserExtendMapper {

    List<StudentCouserExtend>  findAllByxk(String xk_name);

}
