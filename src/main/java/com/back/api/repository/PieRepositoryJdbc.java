package com.back.api.repository;

import com.back.api.model.PieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PieRepositoryJdbc implements PieRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<PieModel> getPie() {
        return jdbcTemplate.query("SELECT * FROM vPie",
                BeanPropertyRowMapper.newInstance(PieModel.class));
    }
}
