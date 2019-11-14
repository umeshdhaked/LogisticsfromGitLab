package com.stackroute.repo;

import com.stackroute.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Integer>
{
    public abstract boolean existsByEmail(String s);
    public abstract User findByEmail(String s);
}
