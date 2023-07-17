package com.antoalex.backend.learnspringboot.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.antoalex.backend.learnspringboot.model.Content;
import com.antoalex.backend.learnspringboot.model.Status;
import com.antoalex.backend.learnspringboot.model.Type;

@Repository
public class ContentJdbcTemplateRepository {
    
    private final JdbcTemplate jdbcTemplate;
    
    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    private static Content mapRow(ResultSet res, int rowNum) throws SQLException{
        return new Content(res.getInt("id"),
        res.getString("title"),
        res.getString("desc"),
        Status.valueOf(res.getString("status")),
        Type.valueOf(res.getString("type")),
        res.getObject("date_created", LocalDateTime.class),
        res.getObject("date_updated", LocalDateTime.class),
        res.getString("url"));
    }

    public List<Content> getAllContent() throws SQLException{
        String sql = "SELECT * FROM Content;";
        List<Content> contents = jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
        return contents;
    }

    public void createContent(String title, String desc, Status status, Type contentType, String URL) throws SQLException{
        String sql = "INSERT INTO Content (title, desc, status, type, date_created, url) VALUES (?, ?, ?, ?, NOW(), ?);";
        jdbcTemplate.update(sql, title, desc, status, contentType, URL);
    }

    public void updateContent(int id, String title, String desc, Status status, Type contentType, String URL){
        String sql = "UPDATE Content SET title=?, desc=?, status=?, type=?, date_updated=NOW(), url=? WHERE id=?;";
        jdbcTemplate.update(sql, title, desc, status, contentType, URL, id);
    }

    public void deleteContent(int id) throws SQLException{
        String sql = "DELETE FROM Content WHERE id=?;";
        jdbcTemplate.update(sql, id);
    }

    public Content getContent(int id) throws SQLException{
        String sql = "SELECT * FROM Content WHERE id=?;";
        Content content = jdbcTemplate.queryForObject(sql, ContentJdbcTemplateRepository::mapRow, new Object[]{id});
        return content;
    }
}
