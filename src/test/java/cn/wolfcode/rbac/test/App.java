package cn.wolfcode.rbac.test;

import cn.wolfcode.rbac.domain.Department;
import cn.wolfcode.rbac.mapper.DepartmentMapper;
import cn.wolfcode.rbac.mapper.EmployeeMapper;
import cn.wolfcode.rbac.service.IDepartmentService;
import cn.wolfcode.rbac.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Albert on 2019/5/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private IDepartmentService departmentService;

    @Autowired
    private IEmployeeService employeeService;

    @Test
    public void testDepartmentMapper() throws Exception{
        //System.out.println(departmentMapper.selectAll());
        //System.out.println(employeeMapper.selectAll());
        //System.out.println(departmentService.listAll());
        System.out.println(employeeService.listAll());
    }
}