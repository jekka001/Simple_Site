package com.myCompany.twitterClone.data.repository;

import com.myCompany.twitterClone.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, BigInteger> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
