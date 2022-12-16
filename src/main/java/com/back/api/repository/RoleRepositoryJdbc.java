package com.back.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.back.api.model.RoleModel;

import java.util.List;

@Repository
public class RoleRepositoryJdbc implements RoleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveRole(RoleModel model) {
        return jdbcTemplate.update("INSERT INTO roles (roleFonction, roleLieu) VALUES(?,?)",
                new Object[]{
                        model.getRoleFonction(),
                        model.getRoleLieu()
                });
    }

    @Override
    public int updateRole(RoleModel roleModel) {
        return jdbcTemplate.update("UPDATE roles SET roleFonction = ?, roleLieu = ? WHERE roleId = ?",
                new Object[]{
                        roleModel.getRoleFonction(),
                        roleModel.getRoleLieu(),
                        roleModel.getRoleId()
                });
    }

    @Override
    public RoleModel findRole(Long roleId) {
        try {
            RoleModel roleModel = jdbcTemplate.queryForObject("SELECT * FROM roles WHERE roleId = ?",
                    BeanPropertyRowMapper.newInstance(RoleModel.class), roleId);

            return roleModel;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteRole(Long roleId) {
        return jdbcTemplate.update("DELETE FROM roles WHERE RoleId = ?", roleId);
    }

    @Override
    public List<RoleModel> getRoles() {
        return jdbcTemplate.query("SELECT * FROM roles ORDER BY roleId",
                BeanPropertyRowMapper.newInstance(RoleModel.class));
    }

    @Override
    public int deleteRoles() {
        return jdbcTemplate.update("DELETE FROM roles");
    }

}
