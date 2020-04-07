package org.poem;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.poem.common.Tops;
import org.poem.publish.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisSubscriptionPublishingApplicationTests {

    @Autowired
    private PublishService service;



    @Test
    public void contextLoads() {
        for (int i = 0; i < 10; i++) {
            service.publish(Tops.TEST_TOP, "hello~~~" + i);
        }
    }
}
