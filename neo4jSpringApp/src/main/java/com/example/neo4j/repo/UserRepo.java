package com.example.neo4j.repo;

import com.example.neo4j.model.Movie;
import com.example.neo4j.model.RATED;
import com.example.neo4j.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface UserRepo extends Neo4jRepository<User, Long> {

    @Query("MATCH (m:Movie) - [r:RATED] -> (u:User) return m,r,u")
    Collection<RATED> getAllUsers();
}
