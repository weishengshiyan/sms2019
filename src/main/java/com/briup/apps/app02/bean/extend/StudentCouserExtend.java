package com.briup.apps.app02.bean.extend;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.StudentCourse;
import com.briup.apps.app02.bean.User;
// 类的属性，包括 所有的courser和teacher_id查询到课程的教师，再用student_id来查询所有的学生
//对应关系 student_id对student的id
public class StudentCouserExtend extends StudentCourse {


    private User student;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    private Course course;



    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }
}
