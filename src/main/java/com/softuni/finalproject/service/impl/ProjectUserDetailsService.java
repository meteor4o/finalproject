package com.softuni.finalproject.service.impl;

import com.softuni.finalproject.model.entity.UserEntity;
import com.softuni.finalproject.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProjectUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public ProjectUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var userEntity = userRepository.
                findByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException("User with username " + username + " was not found"));
        return map(userEntity);
    }

    private UserDetails map(UserEntity user) {
        Set<GrantedAuthority> grantedAuthorities =
                user.getRoles().
                        stream().
                        map(roleEntity -> new SimpleGrantedAuthority("ROLE" + roleEntity.getRole().name())).
                        collect(Collectors.toUnmodifiableSet());
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
