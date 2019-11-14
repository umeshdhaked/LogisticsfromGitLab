package com.stackroute.repo;

import com.stackroute.domain.UserProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile,Integer>
{

}
