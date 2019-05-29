package cn.wolfcode.rbac.web.controller;

import cn.wolfcode.rbac.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Albert on 2019/5/29.
 */
@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/list")
    public String list(Model m){
        m.addAttribute("list",departmentService.listAll());
        return "department/list";
    }
}
