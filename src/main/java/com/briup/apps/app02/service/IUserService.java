package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.User;

import java.util.List;

public interface IUserService {


    //    void upDataUser(User user);L
//    void insertUser(User user);
//    void deleteUser(Integer id);
//    User selectUserById(Integer id);
//
//
    List<User> findAll();
    void saveOrupdate(User user) throws  Exception;
    User selectUserById(Long id);
    void  deleteUser(Long id) throws  Exception;
    List<User> query(User user);


}