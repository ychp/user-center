package com.ychp.center.auth.model.dto;

import lombok.Data;

/**
 * Desc:
 * Author: <a href="ychp@terminus.io">应程鹏</a>
 * Date: 17/2/2
 */
@Data
public class UserRoleDto {

    private Long roleId;

    private String name;

    private Boolean isGrant = false;

}
