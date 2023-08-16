package com.ecommerce.v2.ecommercev2.services;

import com.ecommerce.v2.ecommercev2.dao.RoleDao;
import com.ecommerce.v2.ecommercev2.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public Role createRole(Role role){
        return roleDao.save(role);
    }
}