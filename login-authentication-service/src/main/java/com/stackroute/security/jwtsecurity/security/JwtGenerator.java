package com.stackroute.security.jwtsecurity.security;

import com.stackroute.security.jwtsecurity.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {


    public String generate(User user) {


        Claims claims = Jwts.claims().setSubject(user.getEmail()); // claims.put("sub",retailer.getEmail());
//        claims.put("pass", user.getPass());
//        claims.put("userId", String.valueOf(user.getId()));
//        claims.put("role", user.getRole());

        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, "youtube").compact();
    }
}
