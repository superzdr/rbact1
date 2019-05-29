package cn.wolfcode.rbac.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private Long id;

    private String name;

    private String sn;

}