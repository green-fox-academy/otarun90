package com.greenfoxacademy.justforfun.repository;

import com.greenfoxacademy.justforfun.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
//    @Query(value = "SELECT name FROM user ORDER BY RAND() LIMIT 1", nativeQuery = true)
//    public String getUserName();
//
//    @Query(value = "SELECT sent_by_me FROM user ORDER BY RAND() LIMIT 1", nativeQuery = true)
//    public String getUserSentByMe();

    @Query(value = "SELECT name FROM user ORDER BY user_id DESC LIMIT 1", nativeQuery = true)
    public String getUserName();
    @Query(value = "SELECT sent_by_me FROM user ORDER BY user_id DESC LIMIT 1", nativeQuery = true)
    public String getUserSentByMe();

    @Query(value = "SELECT * FROM user ORDER BY user_id DESC LIMIT 1", nativeQuery = true)
    public User getNewestUser();

}
