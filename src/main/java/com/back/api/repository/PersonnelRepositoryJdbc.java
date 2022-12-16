package com.back.api.repository;

import com.back.api.model.PersonnelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonnelRepositoryJdbc implements PersonnelRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int savePersonnel(PersonnelModel personnel) {
        return jdbcTemplate.update("INSERT INTO personnels (persCodeExp, persNom, persPrenom, persLogin, persMat, persCIN, persNumTel, persEmail, roleId) VALUES(?,?,?,?,?,?,?,?,(SELECT roleId FROM roles WHERE roleFonction=?))",
                new Object[]{
                        personnel.getPersCodeExp(),
                        personnel.getPersNom(),
                        personnel.getPersPrenom(),
                        personnel.getPersLogin(),
                        personnel.getPersMat(),
                        personnel.getPersCIN(),
                        personnel.getPersNumTel(),
                        personnel.getPersEmail(),
                        personnel.getRoleId()
                });
    }

    @Override
    public int updatePersonnel(PersonnelModel personnel) {
        return jdbcTemplate.update("UPDATE personnels SET persCodeExp = ?, persNom = ?, persPrenom = ?, persLogin = ?, persMat = ?, persCIN = ?, persNumTel = ?, persEmail = ? WHERE persId = ?",
                new Object[]{
                        personnel.getPersCodeExp(),
                        personnel.getPersNom(),
                        personnel.getPersPrenom(),
                        personnel.getPersLogin(),
                        personnel.getPersMat(),
                        personnel.getPersCIN(),
                        personnel.getPersNumTel(),
                        personnel.getPersEmail(),
                        personnel.getPersId()
                }); 
    }

    @Override
    public PersonnelModel getPersonnelById(Long persId) {
        return jdbcTemplate.queryForObject("SELECT * FROM personnels WHERE persId = ?",
                BeanPropertyRowMapper.newInstance(PersonnelModel.class), persId);
    }

    @Override
    public int deletePersonnel(Long persId) {
        return jdbcTemplate.update("DELETE FROM personnels WHERE persId = ?", persId);
    }

    @Override
    public int deletePersonnels() {
        return jdbcTemplate.update("DELETE FROM personnels");
    }

    @Override
    public List<PersonnelModel> getPersonnels() {
        return jdbcTemplate.query("SELECT * FROM personnels ",
                BeanPropertyRowMapper.newInstance(PersonnelModel.class));
    }
}
