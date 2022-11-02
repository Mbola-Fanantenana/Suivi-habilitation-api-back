package com.back.api.repository;

import com.back.api.model.SupportModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SupportRepositoryJdbc implements SupportRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveSupport(SupportModel supp) {
        return jdbcTemplate.update("INSERT INTO supports (supportCode, supportDesc) VALUES(?,?)",
                new Object[]{
                        supp.getSupportCode(),
                        supp.getSupportDesc()
                });
    }

    @Override
    public int updateSupport(SupportModel supportModel) {
        return jdbcTemplate.update("UPDATE supports SET supportCode = ?, supportDesc = ? WHERE supportId = ?",
                new Object[]{
                        supportModel.getSupportCode(),
                        supportModel.getSupportDesc(),
                        supportModel.getSupportId()
                });
    }

    @Override
    public SupportModel findSupportId(Long supportId) {
        try {
            SupportModel supportModel = jdbcTemplate.queryForObject("SELECT * FROM supports WHERE supportId = ?",
                    BeanPropertyRowMapper.newInstance(SupportModel.class), supportId);
            return supportModel;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int deleteSupport(Long supportId) {
        return jdbcTemplate.update("DELETE FROM supports WHERE supportId = ?", supportId);
    }

    @Override
    public int deleteSupports() {
        return jdbcTemplate.update("DELETE FROM supports");
    }

    @Override
    public List<SupportModel> getSupports() {
        return jdbcTemplate.query("SELECT * FROM supports",
                BeanPropertyRowMapper.newInstance(SupportModel.class));
    }
}
