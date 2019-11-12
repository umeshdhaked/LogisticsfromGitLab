package com.example.neo4j.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {

    @Id
    private Long id;
    private String title;
    private String director;


    public Movie() {
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        System.out.println("title = "+title);
        return title;
    }

    public String getDirector() {
        return director;
    }
}
