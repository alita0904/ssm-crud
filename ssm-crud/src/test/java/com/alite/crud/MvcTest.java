package com.alite.crud;

import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:application.xml", "classpath:application-mvc.xml"})
public class MvcTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    // "/emps"
    @Test
    public void testEmps() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pageNum","1")).andReturn();

        PageInfo pageInfo = (PageInfo) result.getRequest().getAttribute("page");

        System.out.println("当前页码" + pageInfo.getPageNum());
        System.out.println("总页码" + pageInfo.getPages());
        System.out.println("总记录" + pageInfo.getTotal());

        System.out.println(pageInfo.getList());

    }

}
