package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.User;

import java.util.List;

public interface UserMapper {

//    void upDateUser(User user);
//    User selectUserById(Integer id);
//    void  insertUser(User user);
//    void deleteUser(Integer id );
//L
    List<User> findAll();
    User selectUserById(Long id);
    List<User> query(User user);
    void    updateUser(User user);
    void    insertUser(User user);
    void    deleteUser(Long id);


}
