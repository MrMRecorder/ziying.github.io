package com.recorder.mhl.view;

import com.recorder.mhl.domain.*;
import com.recorder.mhl.service.BillService;
import com.recorder.mhl.service.DiningTableService;
import com.recorder.mhl.service.EmployeeService;
import com.recorder.mhl.service.MenuService;
import com.recorder.mhl.utils.Utility;


import java.util.List;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class MhlView {

    private boolean loop = true;
    private String key = "";
    private EmployeeService employeeService = new EmployeeService();
    private DiningTableService diningTableService = new DiningTableService();
    private MenuService menuService = new MenuService();
    private BillService billService = new BillService();

    public static void main(String[] args) {

        new MhlView().mainMenu();

    }


    //主菜单
    public void mainMenu() {

        while (loop) {

            System.out.println("==========满汉楼主菜单==========");
            System.out.println("\t\t1.登录满汉楼");
            System.out.println("\t\t2.退出满汉楼");
            System.out.println("请输入您的选择：");
            key = Utility.readString(1);
            switch (key) {

                case "1":
                    System.out.println("请输入员工号：");
                    String id = Utility.readString(50);
                    System.out.println("请输入密  码：");
                    String pwd = Utility.readString(50);
                    //数据库查询
                    Employee employee = employeeService.findByIdAndPwd(id, pwd);
                    if (employee != null) {
                        System.out.println("【" + employee.getName() + "】登陆成功");
                        while (loop) {
                            System.out.println("==========满汉楼二级菜单==========");
                            System.out.println("\t\t1. 显示餐桌状态");
                            System.out.println("\t\t2. 预定餐桌");
                            System.out.println("\t\t3. 显示所有菜品");
                            System.out.println("\t\t4. 点餐服务");
                            System.out.println("\t\t5. 查看账单");
                            System.out.println("\t\t6. 结账");
                            System.out.println("\t\t9. 退出满汉楼");
                            System.out.println("请输入您的选择：");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    showTableState();//显示餐桌状态
                                    break;
                                case "2":
                                    //System.out.println("预定餐桌");
                                    orderTable();
                                    break;
                                case "3":
                                    //System.out.println("显示所有菜品");
                                    showMenu();
                                    break;
                                case "4":
                                    //System.out.println("点餐服务");
                                    orderMenu();
                                    break;
                                case "5":
                                    //System.out.println("查看账单");
                                    showBill();
                                    break;
                                case "6":
                                    //System.out.println("结账");
                                    payBill();
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("请输入正确的选项！");
                            }

                        }

                    } else {
                        System.out.println("用户名或密码错误！");

                    }

                    break;

                case "2":
                    loop = false;
                    break;
                default:
                    System.out.println("请输入正确的选项");

            }
            System.out.println("您已退出满汉楼系统！");


        }

    }

    //显示餐桌状态
    public void showTableState() {
        System.out.println("********餐桌状态显示:********");
        System.out.println("********编号\t\t状态********");
        List<DiningTable> diningTables = diningTableService.selectAll();
        for (DiningTable diningTable : diningTables) {
            System.out.println(diningTable);
        }
    }

    //预定餐桌
    public void orderTable() {

        System.out.println("=========预订界面=========");
        System.out.println("请输入您要预定的餐桌编号：（0退出）");
        int id = Utility.readInt();
        if (id == 0) {
            System.out.println("您已取消预订");
            return;
        }
        System.out.println("请确认：");
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {
            DiningTable diningTable = diningTableService.selectById(id);
            if (diningTable == null) {
                System.out.println("输入的编号不存在！");
                return;
            }
            if ("空".equals(diningTable.getState())) {

                System.out.println("请输入您的姓名");
                String orderName = Utility.readString(10);
                System.out.println("请输入您的电话");
                String orderTel = Utility.readString(11);
                boolean b = diningTableService.orderTable(id, orderName, orderTel);
                if (b) {
                    System.out.println("【" + orderName + "】成功预定" + id + "号餐桌");
                } else {
                    System.out.println("预定失败");
                }
            } else {
                System.out.println("该餐桌暂时不可预订！");
            }
        } else {
            System.out.println("您已取消预订");
        }

    }

    //显示所有菜品
    public void showMenu() {
        List<Menu> menus = menuService.selectAll();
        for (Menu menu : menus) {
            System.out.println(menu);
        }


    }

    //点餐
    public void orderMenu() {

        System.out.println("开始点餐");
        System.out.println("请输入点餐桌号（按0退出）：");
        int tableId = Utility.readInt();
        if (tableId == 0) {
            System.out.println("取消点餐");
            return;
        }
        System.out.println("请输入点餐菜品号（按0退出）：");
        int menuId = Utility.readInt();
        if (menuId == 0) {
            System.out.println("取消点餐");
            return;
        }
        System.out.println("请输入菜品数量 （按0退出）：");
        int nums = Utility.readInt();
        if (nums == 0) {
            System.out.println("取消点餐");
            return;
        }
        //验证餐桌和菜品是否存在
        Menu menu = menuService.selectById(menuId);
        DiningTable diningTable = diningTableService.selectById(tableId);
        if (menu == null) {
            System.out.println("菜品不存在");
            return;
        }
        if (diningTable == null) {
            System.out.println("餐桌不存在");
            return;
        }
        //条件都满足开始点餐
        if (billService.orderMenu(menuId, nums, tableId)) {

            System.out.println("【" + tableId + "号桌】点餐成功");

        }

    }

    //显示账单
    public void showBill() {

        List<MultiTable> bills = billService.selectAll2();
        for (MultiTable  bill : bills) {
            System.out.println(bill);
        }
    }

    //结账
    public void payBill() {

        System.out.println("请输入点餐桌号（按0退出）：");
        int tableId = Utility.readInt();
        if (tableId == 0) {
            System.out.println("取消结账");
            return;
        }
        System.out.println("请输入付款方式（/支付宝/现金/微信/）：");
        String payType = Utility.readString(10);
        if (billService.haveToPay(tableId)) {
            billService.payBill(tableId, payType);
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败,没有可支付账单");
        }

    }
}

