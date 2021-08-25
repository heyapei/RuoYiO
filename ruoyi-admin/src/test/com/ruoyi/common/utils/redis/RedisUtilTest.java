package com.ruoyi.common.utils.redis;

import com.ruoyi.RuoYiApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2021/8/25 17:50
 * @Description:
 */
@SpringBootTest(classes = RuoYiApplication.class)
@RunWith(SpringRunner.class)
@Rollback(value = false)
@Transactional
@Slf4j
public class RedisUtilTest  {

    @Autowired
    private RedisUtil redisUtil;


    @Test
    public void test() {
        redisUtil.set("123", "123");
        log.info("输出：{}",redisUtil.get("123").toString());
    }

}
