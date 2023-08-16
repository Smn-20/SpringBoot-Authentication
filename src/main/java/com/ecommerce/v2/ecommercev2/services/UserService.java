package com.ecommerce.v2.ecommercev2.services;

import com.ecommerce.v2.ecommercev2.dao.RoleDao;
import com.ecommerce.v2.ecommercev2.dao.UserDao;
import com.ecommerce.v2.ecommercev2.entities.Role;
import com.ecommerce.v2.ecommercev2.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
    public User createUser(User user){
        Role role = roleDao.findById("User").get();
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRole(roles);
        user.setPassword(getEncodedPassword(user.getPassword()));
        return userDao.save(user);
    }

    public String getEncodedPassword(String password){
        return passwordEncoder.encode(password);
    }
}
