package com.antoalex.backend.learnspringboot.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import jakarta.validation.constraints.NotBlank;

public record Content(
    
    @Id
    Integer id,
    
    @NotBlank
    String title,
    
    String desc,
    Status status,
    Type type,
    
    @Column(value = "DATE_CREATED")
    LocalDateTime date_created,
    LocalDateTime date_updated,
    String url
) {

}
