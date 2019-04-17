package spring.cloud.deep.test.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.cloud.deep.test.dao.RedisDao;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisTest {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RedisTest.class);
    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis() {
        redisDao.setKey("name", "a");
        redisDao.setKey("age", "11");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }
}
