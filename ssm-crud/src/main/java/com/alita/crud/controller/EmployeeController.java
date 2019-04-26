package com.alita.crud.controller;

import com.alita.crud.bean.Msg;
import com.alita.crud.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @RequestMapping("/emps")
    @ResponseBody
    public Msg getEmpsForJson(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        PageInfo pageInfo = empService.getEmpsByPage(pageNum);
        return Msg.success().add("pageInfo", pageInfo);
    }

//    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {
        PageInfo pageInfo = empService.getEmpsByPage(pageNum);
        model.addAttribute("pageInfo", pageInfo);
        return "list";
    }




}
