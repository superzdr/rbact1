package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Department;

import java.util.List;

/**
 * Created by Albert on 2019/5/29.
 */
public interface IDepartmentService {
    int delete(Long id);

    int insert(Department record);

    Department get(Long id);

    List<Department> listAll();

    int update(Department record);
}
