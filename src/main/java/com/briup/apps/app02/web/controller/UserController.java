package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.User;
import com.briup.apps.app02.service.IUserService;
import com.briup.apps.app02.utils.Message;
import com.briup.apps.app02.utils.MessagesUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


//
//    @GetMapping("/upDataUser")
//    public void upDataUser() {
//        User user = new User();
//        user.setId(1);
//        user.setRealname("ls");
//        user.setGender("二年级");
//        iUserService.upDataUser(user);
//    }
//
//    @GetMapping("/insertUser")
//    public void insertUser() {
//        User user = new User();
//        user.setId(11);
//        user.setRealname("李赞");
//        user.setGender("幼儿园");
//
//        iUserService.insertUser(user);
//    }
//
//    @GetMapping("/deleteUser")
//    public void deleteUser() {
//            iUserService.deleteUser(22);
//
//
//    }
//
////
////  @ApiParam swagger的注解，注释一下
////    @ApiOperation 也是swagger的注解，注释方法
////    @RequestParam spring 注解 是用来标出必须要的元素
//
//    @ApiOperation(value = "通过id查询")
//    @GetMapping("/selectUserById")
//    public User searchUserById(@ApiParam(value = "主键",required = true) @RequestParam(value = "id") Integer id) {
////        User user=new User();
////        user.setId(1);
//
//        return iUserService.selectUserById(id);
//    }
//}
//
@Autowired
private IUserService iUserService;



    @ApiOperation("查询所有")
    @GetMapping("findAll")
    public Message findAll() {
        List<User> list = iUserService.findAll();
        return MessagesUtils.success("success",list);
    }



    @ApiOperation("通过id查找")
    @GetMapping("selectUserById")
    public Message selectUserById(@ApiParam(value = "主键",required =true) @RequestParam(value = "id")long id){
        User user = iUserService.selectUserById(id);

        return  MessagesUtils.success("success",user);


    }
    @ApiOperation("保存或更新")
    @GetMapping("saveOrupdate")
        public Message saveOrUpdate(User user){
            try {
                iUserService.saveOrupdate(user);

                return MessagesUtils.success("success");
            } catch (Exception e) {
                e.printStackTrace();
                return MessagesUtils.error(e.getMessage());
            }
        }
        @ApiOperation("通过id删除用户")
        @GetMapping("deleteUser")
        public Message deleteUser(@ApiParam(value = "主键",required =true) @RequestParam(value = "id")Long id) throws  Exception{

            try {
                iUserService.deleteUser(id);
                return MessagesUtils.success("删除成功");
            } catch (Exception e) {
                e.printStackTrace();
                return MessagesUtils.error(e.getMessage());
            }
        }
        @ApiOperation("模糊查询")
        @GetMapping("query")
        public Message query(User user){
            List<User> list = iUserService.query(user);
            return  MessagesUtils.success("success",list);

        }
    }


