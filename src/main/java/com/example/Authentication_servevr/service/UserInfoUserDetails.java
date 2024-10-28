package com.example.Authentication_servevr.service;


import com.example.Authentication_servevr.Entity.UserEnt;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserInfoUserDetails implements UserDetails {
    private String name;
    private String password;
    public UserInfoUserDetails(UserEnt user) {
        this.name=user.getUsername();
        this.password=user.getPassword();


    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }



    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }
}
