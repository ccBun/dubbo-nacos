package com.cen.controller;

import com.cen.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("/demo/{name}")
    public String greet(@PathVariable String name) {
        return demoService.sayHello(name);
    }
}
