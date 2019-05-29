package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.domain.Department;
import cn.wolfcode.rbac.mapper.DepartmentMapper;
import cn.wolfcode.rbac.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
@Repository
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper mapper;

    @Override
    public int delete(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Department record) {
        return mapper.insert(record);
    }

    @Override
    public Department get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Department> listAll() {
        return mapper.selectAll();
    }

    @Override
    public int update(Department record) {
        return mapper.updateByPrimaryKey(record);
    }
}
