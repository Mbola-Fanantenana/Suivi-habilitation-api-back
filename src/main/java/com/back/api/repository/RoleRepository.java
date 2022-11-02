package com.back.api.repository;

import com.back.api.model.RoleModel;

import java.util.List;

public interface RoleRepository {
    int saveRole(RoleModel model);
    int updateRole(RoleModel model);
    RoleModel findRole(Long roleId);
    int deleteRole(Long roleId);
    List<RoleModel> getRoles();
    int deleteRoles();
}
