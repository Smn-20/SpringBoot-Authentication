package com.ecommerce.v2.ecommercev2.dao;

import com.ecommerce.v2.ecommercev2.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
