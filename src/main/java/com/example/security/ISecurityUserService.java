package com.example.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
