package com.back.api.repository;

import com.back.api.model.DateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DateRepositoryJdbc implements DateRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<DateModel> getCurrentDate() {
        return jdbcTemplate.query("SELECT * FROM current_date",
                BeanPropertyRowMapper.newInstance(DateModel.class));
    }
}
