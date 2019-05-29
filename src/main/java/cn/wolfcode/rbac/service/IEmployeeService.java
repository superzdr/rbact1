package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Employee;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
public interface IEmployeeService {
    int delete(Long id);

    int insert(Employee record);

    Employee get(Long id);

    List<Employee> listAll();

    int update(Employee record);
}
