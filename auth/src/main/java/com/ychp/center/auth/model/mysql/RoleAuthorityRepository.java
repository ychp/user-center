package com.ychp.center.auth.model.mysql;

import com.ychp.center.auth.model.RoleAuthority;
import com.ychp.coding.common.mysql.MybatisRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc:
 * Author: <a href="ychp@terminus.io">应程鹏</a>
 * Date: 16/12/13
 */
@Repository
public interface RoleAuthorityRepository extends MybatisRepository<RoleAuthority> {

    List<RoleAuthority> findByRoleIdAndAppIds( @Param("roleId") Long roleId, @Param("appIds") List<Long> appIds);

    List<RoleAuthority> findByRoleIdAndAppIds( @Param("roleIds") List<Long> roleIds, @Param("appIds") List<Long> appIds);

    List<RoleAuthority> findByRoleId( @Param("roleId") Long roleId);
}
