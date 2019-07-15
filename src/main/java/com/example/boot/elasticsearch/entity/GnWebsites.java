package com.example.boot.elasticsearch.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 16:27
 */
@Data
@TableName("gn_websites")
@Document(indexName = "gnms", type = "gn_websites")
public class GnWebsites implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private String name;

    private String icon;

    private String url;

    @TableField("category_id")
    private Long categoryId;

    @TableField("big_category_id")
    private Long bigCategoryId;

    private Integer level;

    private String source;

    private Integer apply;

    @TableField("is_black")
    private Integer isBlack;

    private Integer valid;

    @TableField("create_time")
    private Date createTime;

    @TableField("create_user")
    private Long createUser;

    @TableField("modify_user")
    private String modifyUser;

    @TableField("modify_time")
    private Date modifyTime;
}
