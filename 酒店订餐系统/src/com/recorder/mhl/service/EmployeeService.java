package com.recorder.mhl.service;

import com.recorder.mhl.dao.EmployeeDao;
import com.recorder.mhl.domain.Employee;

/**
 * @author 紫英
 * @version 1.0
 * @discription 该类通过EmployeeDao完成对Employee表的各种操作
 */
public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findByIdAndPwd(String id, String pwd) {
        //通过员工id和密码查找
        return employeeDao.selectSingle("select * from employee where empId = ? and pwd = md5(?)", Employee.class, id, pwd);

    }

}
