package com.luo.blog.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luo.blog.exception.SystemException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class JSONUtil {

    public static String format(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        );
        try{
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new SystemException("JSON解析错误: " + obj);
        }
    }

    public static <T> T get(HttpServletRequest request, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        );
        try{
            return objectMapper.readValue(request.getInputStream(), clazz);//获取实例化对象
        } catch (IOException e) {
            e.printStackTrace();
            throw new SystemException("JSON反序列化失败 ！");
        }
    }


}
