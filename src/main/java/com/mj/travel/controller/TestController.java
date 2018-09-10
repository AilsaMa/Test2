package com.mj.travel.controller;

import com.mj.travel.entity.TravelDestination;
import com.mj.travel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hcmony on 2017/9/5.
 */
@RestController
public class TestController {

   @Autowired
   private TestService testService;
/*   @Value("${server.port}")
   String port;
   @Value("${name}")
   private  String name;
   @Value("${age}")
   private  String age;
   @Value("${version}")
   private  String version="开发环境";*/

   @RequestMapping("/test")
   public String test(){
      TravelDestination travelDestination = testService.test();
      return travelDestination.toString();
   }
}