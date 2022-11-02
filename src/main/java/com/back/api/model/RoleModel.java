package com.back.api.model;

public class RoleModel {

    private Long roleId;
    private String roleFonction;
    private String roleLieu;

    public RoleModel() {

    }

    public RoleModel(long roleId, String roleFonction, String roleLieu) {
        this.roleId = roleId;
        this.roleFonction = roleFonction;
        this.roleLieu = roleLieu;
    }

    public RoleModel(String roleFonction, String roleLieu) {
        this.roleFonction = roleFonction;
        this.roleLieu = roleLieu;
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

    public String getRoleLieu() {
        return roleLieu;
    }

    public void setRoleLieu(String roleLieu) {
        this.roleLieu = roleLieu;
    }
}
