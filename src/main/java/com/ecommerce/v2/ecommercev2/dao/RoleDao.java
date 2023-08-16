package com.ecommerce.v2.ecommercev2.dao;

import com.ecommerce.v2.ecommercev2.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {

}
