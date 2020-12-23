package com.mqz.mini.cloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/12/23
 */
@RestController
@RequestMapping("/web/")
public class NacosClientController {

    @GetMapping("/1")
    public String a(){
        return "ok";
    }
}
