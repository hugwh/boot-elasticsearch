package com.example.boot.elasticsearch.service.impl;

import com.example.boot.elasticsearch.entity.GnWebsites;
import com.example.boot.elasticsearch.service.DataService;
import com.example.boot.elasticsearch.service.db.GnWebsitesDbService;
import com.example.boot.elasticsearch.service.es.GnWebsitesEsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据服务
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 17:09
 */
@Slf4j
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private GnWebsitesDbService gnWebsitesDbService;
    @Autowired
    private GnWebsitesEsService gnWebsitesEsService;

    @Override
    public void transfer() {
        transfer(-1, 0);
    }

    public void transfer(long id, int sum) {
        if (sum >= 20) {
            return;
        }

        int count = 10;

        List<GnWebsites> list = gnWebsitesDbService.queryBatch(id, count);

        boolean sucess = gnWebsitesEsService.save(list);
        log.info("保存状态：{}, 记录数：{}", sucess, list.size());

        if (list.size() < count) {
            transfer(list.get(list.size() -1).getId(), sum + list.size());
        }
    }
}
