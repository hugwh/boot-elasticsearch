package com.example.boot.elasticsearch.service.db;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot.elasticsearch.entity.GnWebsites;

import java.util.List;

/**
 * db service
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:48
 */
public interface GnWebsitesDbService extends IService<GnWebsites> {
    List<GnWebsites> queryBatch(long id, int count);
}
