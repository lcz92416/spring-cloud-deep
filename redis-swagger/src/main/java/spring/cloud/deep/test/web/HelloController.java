package spring.cloud.deep.test.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.deep.test.service.HelloService;

//@Api
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @ApiOperation(value = "哈喽", notes = "哈喽")
    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @ApiOperation(value = "哈喽设置", notes = "哈喽设置")
    @RequestMapping("/helloConfig")
    public String helloConfig() {
        return helloService.helloConfig();
    }

}
