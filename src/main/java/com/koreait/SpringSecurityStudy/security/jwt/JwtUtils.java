package com.koreait.SpringSecurityStudy.security.jwt;


import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtUtils {

    private final Key KEY;

    public JwtUtils(@Value("&{jwt.secret}") String secret) {
        KEY = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
    }

    public String generateAccessToken(String id) {
        return wts.builder()
                .subject("AccessToken")
                .id(id)
                .signWith(Key)
                .compact();
    }

    public void isBearer(String token) {
        return;
    }





}