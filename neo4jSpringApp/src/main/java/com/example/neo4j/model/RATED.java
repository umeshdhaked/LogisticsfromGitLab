package com.example.neo4j.model;

import org.neo4j.ogm.annotation.*;


@RelationshipEntity(type = "RATED")
public class RATED {


    @Id @GeneratedValue
    private Long id;
    @StartNode private Movie movie;
    @EndNode private User user;
    private Long rating;

    public RATED(){}

    //getters
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public Long getRating() { return rating; }
}
