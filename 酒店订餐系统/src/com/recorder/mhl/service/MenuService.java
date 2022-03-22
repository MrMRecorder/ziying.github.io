package com.recorder.mhl.service;

import com.recorder.mhl.dao.MenuDao;
import com.recorder.mhl.domain.Menu;

import java.util.List;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class MenuService {

    private MenuDao menuDao = new MenuDao();
    //查询所有菜品
    public List<Menu> selectAll(){

      return menuDao.selectMulti("select * from menu",Menu.class);

    }
    //根据id查询菜品
    public Menu selectById(int id){

        return menuDao.selectSingle("select * from menu where id = ?", Menu.class, id);

    }

}
