package com.back.api.repository;

import com.back.api.model.BarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BarRepositoryJdbc implements BarRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<BarModel> getBar() {
        return jdbcTemplate.query("SELECT * FROM vBar",
                BeanPropertyRowMapper.newInstance(BarModel.class));
    }
}
