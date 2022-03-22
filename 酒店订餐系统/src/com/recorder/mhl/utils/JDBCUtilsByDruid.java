package com.recorder.mhl.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 紫英
 * @version 1.0
 * @discription 基于 druid 数据库连接池的工具类
 */
public class JDBCUtilsByDruid {

    private static DataSource ds;

    //在静态代码块完成 ds 初始化
    static {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //编写 getConnection 方法
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //关闭连接,这里注意： 在数据库连接池技术中，close 不是真的断掉连接
    // 而是把使用的 Connection 对象放回连接池，因为这里的connection是上面的return ds.getConnection()得到的
    public static void close(ResultSet set, Statement statement, Connection connection) {


        try {
            //判断是否为空
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            //将编译异常转成运行异常抛出
            throw new RuntimeException(e);
        }
    }

}
