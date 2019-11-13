package com.example.neo4j.model;

import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
public class User {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private Integer age;

//    @Relationship(type = "RATED", direction = Relationship.INCOMING)
//    List<Movie> movies;


    public User() {
    }


    //Getters
    public Long getId() { return id; }

//    public List<Movie> getMovies() { return movies; }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


}
