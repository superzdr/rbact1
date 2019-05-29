package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.domain.Role;
import cn.wolfcode.rbac.mapper.RoleMapper;
import cn.wolfcode.rbac.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
@Repository
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper mapper;

    @Override
    public int delete(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return mapper.insert(record);
    }

    @Override
    public Role get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> listAll() {
        return mapper.selectAll();
    }

    @Override
    public int update(Role record) {
        return mapper.updateByPrimaryKey(record);
    }
}
