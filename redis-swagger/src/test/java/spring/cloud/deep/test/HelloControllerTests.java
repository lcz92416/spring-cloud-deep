package spring.cloud.deep.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import spring.cloud.deep.test.service.HelloService;

import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTests {
    @Autowired
    private HelloService helloService ;
        @Test
        public void hello() throws Exception {
            String s=helloService.hello("a","b");
            System.out.println(s);
        }
    @Test
    public void helloConfig() throws Exception {
        String s=helloService.helloConfig();
        System.out.println(s);
    }
    }

