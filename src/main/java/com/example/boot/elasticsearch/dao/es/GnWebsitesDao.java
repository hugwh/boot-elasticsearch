package com.example.boot.elasticsearch.dao.es;

import com.example.boot.elasticsearch.entity.GnWebsites;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * es dao
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:45
 */
public interface GnWebsitesDao extends ElasticsearchRepository<GnWebsites, Long> {
}
