package com.briup.apps.app02.service.imp;

import com.briup.apps.app02.bean.User;
import com.briup.apps.app02.dao.UserMapper;
import com.briup.apps.app02.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;




    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User selectUserById(Long id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public void saveOrupdate(User user) throws  Exception {
        if (user.getId()== null) {

            user.setStatus("正常");
            userMapper.insertUser(user);
            System.out.println("执行了插入操作");

        }
        else {

            userMapper.updateUser(user);
            System.out.println("执行了更新操作");
        }
    }
        @Override
        public void deleteUser(Long id) throws  Exception {
            User user = userMapper.selectUserById(id);
            if (user.getId() != null) {
                userMapper.deleteUser(id);
            } else {
                throw new Exception("用户不存在");
            }

        }
        public List<User> query(User user){

            return userMapper.query(user);
            }



        }





