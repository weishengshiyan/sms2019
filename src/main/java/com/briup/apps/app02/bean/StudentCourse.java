package com.briup.apps.app02.bean;

public class StudentCourse {
    private Long id;
    private String xk_name;
    private  String grade;
    private  Long student_id;
    private  Long Course_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXk_name() {
        return xk_name;
    }

    public void setXk_name(String xk_name) {
        this.xk_name = xk_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getCourse_id() {
        return Course_id;
    }

    public void setCourse_id(Long course_id) {
        Course_id = course_id;
    }
}
