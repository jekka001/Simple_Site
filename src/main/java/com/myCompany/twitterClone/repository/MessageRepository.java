package com.myCompany.twitterClone.repository;

import com.myCompany.twitterClone.entity.Message;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;

public interface MessageRepository extends CrudRepository<Message, BigInteger> {

    List<Message> findByTag(String tag);
}
