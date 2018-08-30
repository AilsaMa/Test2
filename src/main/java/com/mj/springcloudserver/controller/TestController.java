package com.mj.springcloudserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hcmony on 2017/9/5.
 */
@RestController
public class TestController {

   @Value("${server.port}")
   String port;
   @Value("${name}")
   private  String name;
   @Value("${age}")
   private  String age;
   @Value("${version}")
   private  String version="开发环境";

   @RequestMapping("/test")
   public String test(){
      return "server被调用了！:" +port + "你好，我是"+name+",年龄："+age+"岁。当前环境："+version;
   }
}