package com.back.api.repository;

import com.back.api.model.TotalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TotalRepositoryJdbc implements TotalRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<TotalModel> getTotal() {
        return jdbcTemplate.query("SELECT * from vtotal",
                BeanPropertyRowMapper.newInstance(TotalModel.class));
    }
}
