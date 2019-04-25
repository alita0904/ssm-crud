package com.alite.crud;

//import com.alita.crud.mapper.DepartmentMapper;
import com.alita.crud.bean.Department;
import com.alita.crud.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ContextConfiguration 指定Spring配置文件的位置
 * 帮我们创建ioc容器
 *
 * @RunWith junit提供的注解，传一个参数，运行测试的时候
 * 指定 哪个来 运行单元测试
 * 所有的测试test都由 SpringJUnit4ClassRunner 它来运行
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class MapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testCRUD() {

        Department dept = new Department();
        departmentMapper.insertSelective(dept);
//        System.out.println("departmentMapper = " + departmentMapper);
    }


}
