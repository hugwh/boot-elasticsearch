package com.example.boot.elasticsearch.service.impl.db;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot.elasticsearch.dao.db.GnWebsitesMapper;
import com.example.boot.elasticsearch.entity.GnWebsites;
import com.example.boot.elasticsearch.service.db.GnWebsitesDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * db service impl
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:50
 */
@Service
public class GnWebsitesDbServiceImpl extends ServiceImpl<GnWebsitesMapper, GnWebsites> implements GnWebsitesDbService {

    @Autowired
    private GnWebsitesMapper gnWebsitesMapper;

    @Override
    public List<GnWebsites> queryBatch(long id, int count) {
        return gnWebsitesMapper.queryBatch(id, count);
    }
}
