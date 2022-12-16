package com.back.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.back.api.model.EtablissementModel;

import java.util.List;

@Repository
public class EtablissementRepositoryJdbc implements EtablissementRepository{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveEtab(EtablissementModel etab) {
        return jdbcTemplate.update("INSERT INTO etablissements (etabCode, etabDesc) VALUES(?,?)",
                new Object[]{
                        etab.getEtabCode(),
                        etab.getEtabDesc()
                });
    }

    @Override
    public int updateEtab(EtablissementModel updated) {
        return jdbcTemplate.update("UPDATE etablissements SET etabCode = ?, etabDesc = ? WHERE etabId = ?",
                new Object[]{
                        updated.getEtabCode(),
                        updated.getEtabDesc(),
                        updated.getEtabId()
                });
    }

    @Override
    public int deleteEtab(Long etabId) {
        return jdbcTemplate.update("DELETE FROM etablissements WHERE etabId = ?", etabId);
    }

    @Override
    public EtablissementModel findEtabById(Long etabId) {
        try {
            EtablissementModel etablissementModel = jdbcTemplate.queryForObject("SELECT * FROM etablissements WHERE etabId = ?",
                    BeanPropertyRowMapper.newInstance(EtablissementModel.class), etabId);
            return etablissementModel;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteAllEtab() {
        return jdbcTemplate.update("DELETE FROM etablissements");
    }

    @Override
    public List<EtablissementModel> getAllEtab() {
        return jdbcTemplate.query("SELECT * FROM etablissements ORDER BY etabCode ASC",
                BeanPropertyRowMapper.newInstance(EtablissementModel.class));
    }
}
