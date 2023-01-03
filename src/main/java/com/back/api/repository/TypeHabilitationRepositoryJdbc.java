package com.back.api.repository;

import com.back.api.model.TypeHabilitationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TypeHabilitationRepositoryJdbc implements TypeHabilitationRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int saveTypeHab(TypeHabilitationModel type) {
        return jdbcTemplate.update("INSERT INTO typeHabilitations (typeHabCode, typeHabDesc) VALUES(?,?)",
                new Object[]{
                        type.getTypeHabCode(),
                        type.getTypeHabDesc()
                });
    }

    public int updateHab(TypeHabilitationModel typeHab) {
        return jdbcTemplate.update("UPDATE typeHabilitations SET typeHabCode = ?, typeHabDesc = ? WHERE typeHabId = ?",
                new Object[]{
                        typeHab.getTypeHabCode(),
                        typeHab.getTypeHabDesc(),
                        typeHab.getTypeHabId()
                });
    }

    public TypeHabilitationModel findTypeById(Long typeHabId) {
        try {
            TypeHabilitationModel typeHabilitationModel = jdbcTemplate.queryForObject("SELECT * FROM typeHabilitations WHERE typeHabId = ?",
                    BeanPropertyRowMapper.newInstance(TypeHabilitationModel.class), typeHabId);
            return typeHabilitationModel;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    public int deleteTypeHab(Long typeHabId) {
        return jdbcTemplate.update("DELETE FROM typeHabilitations WHERE typeHabId = ?", typeHabId);
    }

    public int deleteAllType() {
        return jdbcTemplate.update("DELETE FROM typeHabilitations");
    }

    public List<TypeHabilitationModel> getAllTypes() {
        return jdbcTemplate.query("SELECT * FROM typeHabilitations ORDER BY typeHabId ASC",
                BeanPropertyRowMapper.newInstance(TypeHabilitationModel.class));
    }
}
