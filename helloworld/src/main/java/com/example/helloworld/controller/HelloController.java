package com.example.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
  
  Logger log = LoggerFactory.getLogger(HelloController.class);
  
  private Map<String,Object> result = new HashMap<>();
  
  @RequestMapping("/hello")
  @ResponseBody
  public Map<String,Object> hello() {
    result.put("hey","anugrah");
    return result;
  }
}
