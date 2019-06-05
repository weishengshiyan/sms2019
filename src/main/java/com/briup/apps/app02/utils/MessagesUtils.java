package com.briup.apps.app02.utils;

import java.util.Date;

public class MessagesUtils {
    /***
     * 返回成功消息，一般用户增删改查的结果返回
     * @param msg
     * @return
     */
    public static Message success(String msg) {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    public static Message error(String msg) {
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        return message;
    }

    public static Message success(String msg,Object data) {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(new Date().getTime());
        message.setData(data);
        return message;
    }
}
