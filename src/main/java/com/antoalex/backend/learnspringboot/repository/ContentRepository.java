package com.antoalex.backend.learnspringboot.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.antoalex.backend.learnspringboot.model.Content;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

        List<Content> findAllByContentType(String type);

    
}
