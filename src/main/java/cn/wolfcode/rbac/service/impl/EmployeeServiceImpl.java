package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.mapper.EmployeeMapper;
import cn.wolfcode.rbac.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
@Repository
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper mapper;

    @Override
    public int delete(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employee record) {
        return mapper.insert(record);
    }

    @Override
    public Employee get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> listAll() {
        return mapper.selectAll();
    }

    @Override
    public int update(Employee record) {
        return mapper.updateByPrimaryKey(record);
    }
}
