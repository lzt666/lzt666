package com.luo.blog.servlet;

import com.luo.blog.exception.ParameterException;
import com.luo.blog.util.SqlConnection;
import com.luo.blog.entity.Article;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ArticleListServlet extends BaseServlet {


    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        //System.out.println(req.getParameter("key1"));
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Article> articles = new ArrayList<>();
        String sid = req.getParameter("id");
        Integer id = null;
        // 处理前端请求的数据
        try{
//             id = Integer.parseInt(req.getParameter("id"));
            id = Integer.parseInt(sid);
        }catch (NumberFormatException e) {
            throw new ParameterException("客户端错误：id 错误(" + sid + ")");
        }
        // 处理业务以及数据库操作

        try {
            connection = SqlConnection.getConnection();
            String sql = "select a.id, a.title, a.user_id,a.content, a.create_time " +
                    "from article a join user u on a.user_id=u.id " +
                    "where u.id=?";
            preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.setInt(1, Integer.parseInt(req.getParameter("id")));
            preparedStatement.setInt(1, id);
            //TODO 处理前端异常
            resultSet = preparedStatement.executeQuery();
            //articles = new ArrayList<>();
            while (resultSet.next()) {
                Article article = new Article();
                article.setId(resultSet.getInt("id"));
                article.setTitle(resultSet.getString("title"));
                article.setContent(resultSet.getString("content"));
                article.setUserId(resultSet.getInt("user_id"));
                article.setCreateTime(resultSet.getTimestamp("create_time"));
                articles.add(article);
            }
            return articles;
        } finally {
            SqlConnection.close(connection,preparedStatement,resultSet);
        }
    }

}
