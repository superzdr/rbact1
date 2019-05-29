package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Permission;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
public interface IPermissionService {
    int delete(Long id);

    int insert(Permission record);

    List<Permission> listAll();

}
