package com.alita.crud.service;

import com.alita.crud.bean.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询指定页的员工信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmpsByPage(Integer pageNum);
}
