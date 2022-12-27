package com.back.api.repository;

import com.back.api.model.TermineModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TermineRepositoryJdbc implements TermineRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<TermineModel> getTermine() {
        return jdbcTemplate.query("SELECT * FROM termine",
                BeanPropertyRowMapper.newInstance(TermineModel.class));
    }
}
