package com.example.boot.elasticsearch.dao.db;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boot.elasticsearch.entity.GnWebsites;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * mybatis mapper
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:42
 */
@Mapper
public interface GnWebsitesMapper extends BaseMapper<GnWebsites> {

    List<GnWebsites> queryBatch(@Param("id") long id, @Param("count") int count);

}
