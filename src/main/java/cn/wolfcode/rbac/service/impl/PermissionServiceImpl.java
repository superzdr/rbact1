package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.domain.Permission;
import cn.wolfcode.rbac.mapper.PermissionMapper;
import cn.wolfcode.rbac.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
@Repository
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper mapper;

    @Override
    public int delete(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Permission record) {
        return mapper.insert(record);
    }

    @Override
    public List<Permission> listAll() {
        return mapper.selectAll();
    }

}
