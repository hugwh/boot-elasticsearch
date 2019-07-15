package com.example.boot.elasticsearch.service.es;

import com.example.boot.elasticsearch.entity.GnWebsites;

import java.util.List;

/**
 * es service
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:51
 */
public interface GnWebsitesEsService {

    boolean save(List<GnWebsites> list);
}
