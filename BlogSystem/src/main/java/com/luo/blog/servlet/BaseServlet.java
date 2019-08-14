package com.luo.blog.servlet;

import com.luo.blog.entity.JSON;
import com.luo.blog.exception.ParameterException;
import com.luo.blog.exception.SystemException;
import com.luo.blog.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseServlet extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       resp.setCharacterEncoding("UTF-8");
       resp.setContentType("application/json;charset=UTF-8");
        JSON resultJSON=new JSON();
        try {
            Object data=process(req,resp);
            resultJSON.setSuccess(true);
            resultJSON.setCode("200");
            resultJSON.setMessage("操作成功");
            resultJSON.setData(data);
        }catch (Exception e){
            if (e instanceof ParameterException){
               resultJSON.setCode(((ParameterException)e).getCode());
               resultJSON.setMessage(((ParameterException)e).getMessage());
            }else if (e instanceof SystemException){
                resultJSON.setCode(((ParameterException)e).getCode());
                resultJSON.setMessage(((ParameterException)e).getMessage());
            }else {
                resultJSON.setCode("500");
                resultJSON.setMessage("操作失败,服务器错误！！");
            }
        }//待处理异常

        resp.getWriter().write(JSONUtil.format(resultJSON));
    }

    public  abstract Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
