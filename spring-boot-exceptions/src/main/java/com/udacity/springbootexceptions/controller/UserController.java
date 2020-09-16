package com.udacity.springbootexceptions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  
  @RequestMapping("/add")
  public String add() {
    int num = 10 / 0;
    return "add";
  }
  
  @RequestMapping("/update")
  public String update() {
    String name = null;
    name = name.toLowerCase();
    return "update";
  }
//
//  @ExceptionHandler(value = {java.lang.ArithmeticException.class})
//  public ModelAndView handleArithmeticError(Exception e) {
//    ModelAndView modelAndView = new ModelAndView();
//    modelAndView.addObject("exception", e.toString());
//    modelAndView.setViewName("mathError");
//    return modelAndView;
//  }
//
//  @ExceptionHandler(value = {java.lang.NullPointerException.class})
//  public ModelAndView handleNullPointerError(Exception e) {
//    ModelAndView modelAndView = new ModelAndView();
//    modelAndView.addObject("exception", e.toString());
//    modelAndView.setViewName("nullPointerError");
//    return modelAndView;
//  }
  
}
