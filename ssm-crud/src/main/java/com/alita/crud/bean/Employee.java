package com.alita.crud.bean;

import lombok.Data;

@Data
public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Department dept;
}