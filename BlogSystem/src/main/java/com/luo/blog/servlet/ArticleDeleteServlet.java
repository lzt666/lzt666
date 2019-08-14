package com.luo.blog.servlet;

import com.luo.blog.entity.Article;
import com.luo.blog.exception.BusinessException;
import com.luo.blog.exception.ParameterException;
import com.luo.blog.util.JSONUtil;
import com.luo.blog.util.SqlConnection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends BaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //System.out.println(req.getParameter("key1"));
        String ids = req.getParameter("ids");//->int []9 ,10
        int[] intids = null;
        try {
            String[] idArray = ids.split(",");
             intids = new int[idArray.length];
            for (int i = 0; i < idArray.length; i++) {
                intids[i] = Integer.parseInt(idArray[i]);
            }
        }catch (Exception e){
            throw new ParameterException("请求参数错误ids="+ids);
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        // 处理业务以及数据库操作
try{
            connection = SqlConnection.getConnection();
            StringBuilder sql =new StringBuilder("delete from article where id in (") ;
            for (int i=0;i<intids.length;i++){
                if (i==0){
                   sql.append("?");
                }else{
                    sql.append(",?");
                }
            }
            sql.append(")");
         System.out.println("sql="+sql);
         preparedStatement = connection.prepareStatement(sql.toString());
            for (int i=0;i<intids.length;i++){

                preparedStatement.setInt(i+1,intids[i]);
            }

            int r = preparedStatement.executeUpdate();
            if(r > 0) {
                return r;
            }else {
                throw new BusinessException("没有该用户" );
            }
        } finally {
            SqlConnection.close(connection,preparedStatement,null);
        }
    }

}
