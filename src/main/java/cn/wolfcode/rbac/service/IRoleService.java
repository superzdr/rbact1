package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Role;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
public interface IRoleService {
    int delete(Long id);

    int insert(Role record);

    Role get(Long id);

    List<Role> listAll();

    int update(Role record);
}
