package com.luo.blog.servlet;

import com.luo.blog.entity.Article;
import com.luo.blog.exception.BusinessException;
import com.luo.blog.util.JSONUtil;
import com.luo.blog.util.SqlConnection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends BaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //System.out.println(req.getParameter("key1"));
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        // 处理前端请求的数据
        //aplication/json数据需要使用inputStrem来获取
//        String userAccount = req.getParameter("userAccout");
//        String title = req.getParameter("title");
//        String content = req.getParameter("content");

        //获取JSON格式的数据
        Article article = JSONUtil.get(req, Article.class);
        System.out.println(article);
        // 处理业务以及数据库操作
        try {
            connection = SqlConnection.getConnection();
            String sql = "update article set title =?,content=? where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, article.getTitle());
            preparedStatement.setString(2, article.getContent());
            preparedStatement.setInt(3, article.getId());
            int r = preparedStatement.executeUpdate();
            if(r > 0) {
                return r;
            }else {
                throw new BusinessException("没有该用户" );
            }
        } finally {
            if (preparedStatement!=null){
                preparedStatement.close();
            }
            if (connection !=null){
                connection.close();
            }
        }
    }
}
