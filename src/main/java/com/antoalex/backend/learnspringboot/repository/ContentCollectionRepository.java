package com.antoalex.backend.learnspringboot.repository;

import org.springframework.stereotype.Repository;
import com.antoalex.backend.learnspringboot.model.Content;
import com.antoalex.backend.learnspringboot.model.Status;
import com.antoalex.backend.learnspringboot.model.Type;

import jakarta.annotation.PostConstruct;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        return content;
    }

    public Optional<Content> findById(Integer id){
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init(){
        Content c = new Content(1, 
        "My First Blog Post", 
        "To All The Good Times We Had", 
        Status.IDEA, 
        Type.ARTICLE,
        LocalDateTime.now(),
        null,
        "");

        content.add(c);
    }

    public void save(Content c){
        content.removeIf(c1 -> c1.id().equals(c.id()));
        content.add(c);
    }

    public boolean existsById(Integer id){
        return content.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id){
        content.removeIf(c1 -> c1.id().equals(id));
    }    
}
