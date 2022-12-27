package com.back.api.repository;

import com.back.api.model.EnCoursModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnCoursRepositoryJdbc implements EnCoursRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<EnCoursModel> getEncours() {
        return jdbcTemplate.query("SELECT * FROM vencours",
                BeanPropertyRowMapper.newInstance(EnCoursModel.class));
    }
}
