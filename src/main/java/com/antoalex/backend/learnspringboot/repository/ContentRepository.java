package com.antoalex.backend.learnspringboot.repository;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import com.antoalex.backend.learnspringboot.model.Content;
import com.antoalex.backend.learnspringboot.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    
    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content
            WHERE status = :status
            """)
    
    List<Content> listByStatus(@Param("status") Status status);
}
