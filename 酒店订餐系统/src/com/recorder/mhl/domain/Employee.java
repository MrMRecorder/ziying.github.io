package com.recorder.mhl.domain;

/**
 * @author 紫英
 * @version 1.0
 * @discription javabean类，对应数据库表
 */

/**
 * id int primary key auto_increment, #自增
 * 	empId varchar(50) not null default '',#员工号
 * 	pwd char(32) not null default '',#密码md5
 * 	name varchar(50) not null default '',#姓名
 * 	job varchar(50) not null default '' #岗位
 */
public class Employee {

    private int id;
    private String empId;
    private String pwd;
    private String name;
    private String job;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Employee(int id, String empId, String pwd, String name, String job) {
        this.id = id;
        this.empId = empId;
        this.pwd = pwd;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
