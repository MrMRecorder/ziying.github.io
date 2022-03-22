package com.recorder.mhl.service;

import com.recorder.mhl.dao.BillDao;
import com.recorder.mhl.dao.MultiTableDao;
import com.recorder.mhl.domain.Bill;
import com.recorder.mhl.domain.MultiTable;

import java.util.List;
import java.util.UUID;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class BillService {

    private BillDao billDao = new BillDao();
    private MultiTableDao multiTableDao = new MultiTableDao();
    private MenuService menuService = new MenuService();
    private DiningTableService diningTableService = new DiningTableService();

    //生成账单
    public boolean orderMenu(int menuId, int nums, int tableId) {
        //使用uuid生成流水号
        String billID = UUID.randomUUID().toString().split("-")[4];
        //组织查询语句——调用menuService计算账单金额
        int dml = billDao.dml("insert into bill values(?,?,?,?,?,?,now(),?)"
                , null, billID, menuId, nums, menuService.selectById(menuId).getPrice() * nums, tableId, "未结账");
        if (dml < 0) {
            return false;
        }
        //更新餐桌状态
        return diningTableService.updateTable_eat(tableId);

    }
    //查询账单
    public List<Bill> selectAll() {
        return billDao.selectMulti("select * from bill ", Bill.class);
    }

    //多表查询——因为class只能反射一个类所以需要写一个新的javabean类，把多表查询需要的两张表的属性都放进去
    //查询账单 + 菜品名
    public List<MultiTable> selectAll2() {
        return multiTableDao.selectMulti("select billId,menuId,name,type,price,nums,money,diningTableId,billDate,state from bill,menu where bill.menuId = menu.id ", MultiTable.class);
    }

    //查看是否有未结账账单
    public boolean haveToPay(int tableID){

        Bill bill = billDao.selectSingle("select * from bill where diningTableId = ? and state = '未结账' limit 0,1", Bill.class, tableID);
        return bill != null;

    }


    //结账
    public boolean payBill(int tableId, String payType) {

        //先检查该桌子是存在，之后否有需要结账的账单
        if (diningTableService.selectById(tableId).getState().equals("用餐中")) {

            if (diningTableService.emptyTable(tableId)) {

                int dml = billDao.dml("update bill set state = ? where diningTableId = ?", payType,tableId);
                return dml > 0;

            } else {
                return false;
            }

        } else {
            return false;
        }
    }


}
