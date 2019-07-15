package com.example.boot.elasticsearch;

import com.example.boot.elasticsearch.service.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 数据服务测试类
 *
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 17:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataServiceTest {

    @Autowired
    private DataService dataService;

    @Test
    public void transfer() {
        dataService.transfer();
    }
}
