package spring.cloud.deep.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import spring.cloud.deep.test.config.HelloConfig;

@Service
//@EnableConfigurationProperties({HelloConfig.class})
public class HelloService implements spring.cloud.deep.test.service.HelloService {
    @Value("${my.name}")
    String name;
    @Value("${my.age}")
    String age;
    @Value("${my.value}")
    String value;
    @Autowired
    HelloConfig helloConfig;

    @Override
    public String hello(String s1, String s2) {

        return name + " " + age + " " + value + " " + s1 + " " + s2;
    }

    @Override
    public String helloConfig() {
        return helloConfig.getName() + " " + helloConfig.getValue() + " " + helloConfig.getAge();
    }
}
