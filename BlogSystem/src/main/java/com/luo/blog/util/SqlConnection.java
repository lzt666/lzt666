package com.luo.blog.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlConnection {
    private static final String URL="jdbc:mysql://localhost:3306/"
    +"blogdemo?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER_NAME="root";
    private static final String PASSWORD="56789";
    private static volatile DataSource dataSource;
    private SqlConnection(){
    }
    public static DataSource getDataSource() {

        if (dataSource==null){
            synchronized (SqlConnection.class){
                if (dataSource==null){
                    dataSource=new MysqlDataSource();
                    ((MysqlDataSource)dataSource).setUrl(URL);
                    ((MysqlDataSource)dataSource).setUser(USER_NAME);
                    ((MysqlDataSource)dataSource).setPassword(PASSWORD);
                }
            }
        }
        return dataSource;
    }
    public static Connection getConnection(){
        try {
            return (Connection) getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){

            try {
                if (resultSet!=null){
                    resultSet.close();
            }
            if (preparedStatement!=null){
                    preparedStatement.close();
            }
            if (connection!=null){
                    connection.close();
            }
        } catch (Exception e) {
                e.printStackTrace();
            }
    }

//    public static void close(ResultSet resultSet, PreparedStatement preparedStatement, java.sql.Connection connection) {
//
//    }
}
