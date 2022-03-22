package com.recorder.mhl.dao;

import com.recorder.mhl.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 紫英
 * @version 1.0
 * @discription BasicDAO , 是其他 DAO 的父类, 使用到 apache-dbutils
 */

//使用泛型，等到子类继承时制定具体类型
public class BasicDao<T> {
    //使用 apache-dbutils
    QueryRunner qr = new QueryRunner();

    //开发通用的 dml 方法, 针对任意的表
    public int dml(String sql, Object... params) {

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            int update = qr.update(connection, sql, params);
            return update;

        } catch (SQLException e) {
            throw new RuntimeException(e); //将编译异常->运行异常 ,抛出
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }

    //返回多个对象(即查询的结果是多行), 针对任意表

    /**
     * @param sql    传入的sql语句
     * @param clazz  对应的类的 Class 对象 比如 Admin.class
     * @param params 传入 ? 的具体的值，可以是多个
     * @return 根据 Admin.class 返回对应的 ArrayList 集合
     */
    public List<T> selectMulti(String sql, Class<T> clazz, Object... params) {

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), params);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }

    public T selectSingle(String sql,Class<T> clazz,Object...params){

        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanHandler<T>(clazz), params);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null, null,connection);
        }

    }

    //查询单行单列的方法,即返回单值的方法
    public Object selectScalar(String sql, Object... params) {

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new ScalarHandler(), params);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }

    }


}