package cn.wolfcode.rbac.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Integer age;

    private Boolean admin;

    private Long deptId;

}