package com.techprimers.security.jwtsecurity.security;

import com.techprimers.security.jwtsecurity.model.Retailer;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {


    private String secret = "youtube";

    public Retailer validate(String token) {

        Retailer retailer = new Retailer();
        retailer.setEmail("fuck you");
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            retailer = new Retailer();

            retailer.setEmail(body.getSubject());
            retailer.setPass((String) body.get("pass"));
            retailer.setId(Long.parseLong((String) body.get("userId")));
            retailer.setRole((String) body.get("role"));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return retailer;
    }
}
