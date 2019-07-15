package com.example.boot.elasticsearch.dao;

import com.example.boot.elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 11:16
 */
@Repository
public interface UserDao extends ElasticsearchRepository<User, Long> {
}
