package com.stackroute.config;

import com.stackroute.repository.TrackRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = TrackRepository.class)
@Configuration
public class MongoDbConfig {

}
