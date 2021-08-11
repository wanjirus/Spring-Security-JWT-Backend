package com.stan.spring_security_springboot_backend.controller.message.responce;
public class JwtResponce {
    private String token;
    private String type = "Bearer";

    public JwtResponce(String accessToken) {
        this.token = accessToken;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }
}