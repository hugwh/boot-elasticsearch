package com.example.boot.elasticsearch.service.impl.es;

import com.example.boot.elasticsearch.dao.db.GnWebsitesMapper;
import com.example.boot.elasticsearch.dao.es.GnWebsitesDao;
import com.example.boot.elasticsearch.entity.GnWebsites;
import com.example.boot.elasticsearch.service.es.GnWebsitesEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * es service impl
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:54
 */
@Service
public class GnWebsitesEsServiceImpl implements GnWebsitesEsService {

    @Autowired
    private GnWebsitesDao gnWebsitesDao;

    @Override
    public boolean save(List<GnWebsites> list) {
        boolean falg=false;
        try{
            gnWebsitesDao.saveAll(list);
            falg=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return falg;
    }
}
