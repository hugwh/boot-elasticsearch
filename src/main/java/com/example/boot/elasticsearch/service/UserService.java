package com.example.boot.elasticsearch.service;

import com.example.boot.elasticsearch.entity.User;

import java.util.List;

/**
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 11:17
 */
public interface UserService {

    boolean insert(User user);

    List<User> search(String searchContent);

    List<User> searchUser(Integer pageNumber, Integer pageSize,String searchContent);

//    List<User> searchUserByWeight(String searchContent);
}
