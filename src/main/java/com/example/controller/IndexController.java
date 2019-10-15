package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-jenkins
 * @ClassName: IndexController
 * @company: 鸿业（深圳）信息技术服务有限公司
 * @author: Lamdong
 * @create: 2019-10-15 15:01
 **/
@RestController
public class IndexController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/index")
    public String index(){
        return "哎，还是有点麻烦哦"+ serverPort;
    }
}
