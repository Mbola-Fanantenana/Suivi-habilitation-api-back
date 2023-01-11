package com.back.api.model;

public class RoleModel {

    private Long roleId;
    private String roleFonction;
    private String roleDesc;

    public RoleModel() {

    }

    public RoleModel(long roleId, String roleFonction, String roleDesc) {
        this.roleId = roleId;
        this.roleFonction = roleFonction;
        this.roleDesc = roleDesc;
    }

    public RoleModel(String roleFonction, String roleDesc) {
        this.roleFonction = roleFonction;
        this.roleDesc = roleDesc;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleFonction() {
        return roleFonction;
    }

    public void setRoleFonction(String roleFonction) {
        this.roleFonction = roleFonction;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
