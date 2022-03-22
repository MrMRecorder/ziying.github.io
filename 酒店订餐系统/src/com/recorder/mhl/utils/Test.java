package com.recorder.mhl.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test() {

        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return   o1 - o2;
            }
        });
        map.put(3, "a");
        map.put(10, "sum1");
        map.put(30, "sum2");
        map.put(50, "sum3");
        Set<Integer> number = map.keySet();
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + "<");
        }
        iterator = number.iterator();
        System.out.println();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(map.get(next) + "<");
        }
    }

    @org.junit.jupiter.api.Test
    public void test2() throws SQLException {

        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner qr = new QueryRunner();
        Object query = qr.query(connection, "select istrue from istrue where id = 1", new ScalarHandler<>());
        System.out.println(query);
    }



}
