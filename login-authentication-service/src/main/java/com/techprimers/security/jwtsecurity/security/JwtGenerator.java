package com.techprimers.security.jwtsecurity.security;

import com.techprimers.security.jwtsecurity.model.Retailer;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {


    public String generate(Retailer retailer) {


        Claims claims = Jwts.claims().setSubject(retailer.getEmail()); // claims.put("sub",retailer.getEmail());

        claims.put("pass",retailer.getPass());
        claims.put("userId", String.valueOf(retailer.getId()));
        claims.put("role", retailer.getRole());

        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, "youtube").compact();
    }
}
