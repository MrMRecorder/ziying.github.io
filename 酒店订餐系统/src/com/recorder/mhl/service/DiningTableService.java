package com.recorder.mhl.service;

import com.recorder.mhl.dao.DiningTableDao;
import com.recorder.mhl.domain.DiningTable;

import java.util.List;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class DiningTableService {
    //注意事项：写完sql语句一定要在编辑器（navicat）中运行一下以防出错！！！

    private DiningTableDao diningTableDao = new DiningTableDao();

    //查询所有
    public List<DiningTable> selectAll() {
        return diningTableDao.selectMulti("select id,state from diningTable", DiningTable.class);
    }

    //根据id查询,如果不存在返回空
    public DiningTable selectById(int id) {

        return diningTableDao.selectSingle(
                "select * from diningtable where id = ?", DiningTable.class, id);

    }

    //预定方法，如果餐桌存在的话更新数据
    public boolean orderTable(int id, String orderName, String orderTel) {

        int dml = diningTableDao.dml("update diningtable set state = '已预定',orderName = ?,orderTel =? where id = ?"
                , orderName, orderTel, id);
        return dml > 0;

    }

    //用餐时更新状态
    public boolean updateTable_eat(int id) {

        int dml = diningTableDao.dml("update diningtable set state = '用餐中' where id = ?", id);
        return dml > 0;

    }


    //餐桌置空
    public boolean emptyTable(int tableId){

        int dml = diningTableDao.dml("update diningTable set state = '空闲',orderName = '',orderTel = '' where id = ?", tableId);
        return dml > 0;

    }
}
