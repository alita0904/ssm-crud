package com.alita.crud.service.impl;

import com.alita.crud.bean.Employee;
import com.alita.crud.mapper.EmployeeMapper;
import com.alita.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper empMapper;

    @Override
    public PageInfo<Employee> getEmpsByPage(Integer pageNum) {

        PageHelper.startPage(pageNum, 5);
        List<Employee> emps = empMapper.selectAllEmp();
        return new PageInfo<>(emps, 5);
    }
}
