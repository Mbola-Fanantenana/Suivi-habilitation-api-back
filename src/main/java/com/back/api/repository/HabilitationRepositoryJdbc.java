package com.back.api.repository;

import com.back.api.model.HabilitationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HabilitationRepositoryJdbc implements HabilitationRepository{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveHabilitation(HabilitationModel habilitationModel) {
        return jdbcTemplate.update("INSERT INTO habilitations (habDateDebut, habDateFin, statusDebut, statusFin, habCaisse, persCodeExp, typeHabCode, etabCode, supportCode, roleFonction, foncInterim) VALUES(?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{
                        habilitationModel.getHabDateDebut(),
                        habilitationModel.getHabDateFin(),
                        habilitationModel.isStatusDebut(),
                        habilitationModel.isStatusFin(),
                        habilitationModel.getHabCaisse(),
                        habilitationModel.getPersCodeExp(),
                        habilitationModel.getTypeHabCode(),
                        habilitationModel.getEtabCode(),
                        habilitationModel.getSupportCode(),
                        habilitationModel.getRoleFonction(),
                        habilitationModel.getFoncInterim()
                });
    }

    @Override
    public int updateHabilitation(HabilitationModel habilitationModel) {
        return jdbcTemplate.update("UPDATE habilitations SET habDateDebut = ?, habDateFin = ?, statusDebut = ?, statusFin = ?, habCaisse = ?, persCodeExp = ?, typeHabCode = ?, etabCode = ?, supportCode = ?, roleFonction = ?, foncIterim = ? WHERE habId = ?",
                new Object[]{
                        habilitationModel.getHabDateDebut(),
                        habilitationModel.getHabDateFin(),
                        habilitationModel.isStatusDebut(),
                        habilitationModel.isStatusFin(),
                        habilitationModel.getHabCaisse(),
                        habilitationModel.getPersCodeExp(),
                        habilitationModel.getTypeHabCode(),
                        habilitationModel.getEtabCode(),
                        habilitationModel.getSupportCode(),
                        habilitationModel.getRoleFonction(),
                        habilitationModel.getFoncInterim(),
                        habilitationModel.getHabId()
                });
    }

    @Override
    public HabilitationModel getHabById(Long habId) {
        try {
            HabilitationModel habilitationModel = jdbcTemplate.queryForObject("SELECT * FROM habilitations WHERE habId = ?",
                    BeanPropertyRowMapper.newInstance(HabilitationModel.class), habId);
            return habilitationModel;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteHabilitation(Long habId) {
        return jdbcTemplate.update("DELETE FROM habilitations WHERE habId = ?", habId);
    }

    @Override
    public int deleteAllHabilitations() {
        return jdbcTemplate.update("DELETE FROM habilitations");
    }

    @Override
    public List<HabilitationModel> getAllHabilitations() {
        return jdbcTemplate.query("SELECT * FROM habilitations",
                BeanPropertyRowMapper.newInstance(HabilitationModel.class));
    }

    @Override
    public List<HabilitationModel> getRapportFin() {
        return jdbcTemplate.query("SELECT * FROM vHabilitations",
                BeanPropertyRowMapper.newInstance(HabilitationModel.class));
    }
}
