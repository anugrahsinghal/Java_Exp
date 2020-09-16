package com.example.udacity.templateengine.controller;

import com.example.udacity.templateengine.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList {
  
  
  /**
   * For Thymeleaf
   * @param model
   * @return
   */
  @RequestMapping("/list2")
  public String list2(Model model) {
    List<Student> list = new ArrayList<>();
    list.add(new Student(1, "Tom", 80.5));
    list.add(new Student(2, "Jerry", 90.4));
    list.add(new Student(3, "Paul", 77.5));
    model.addAttribute("list", list);
    return "list2";
  }
  
  
  /**
   * For Apache Freemaker
   * @param model
   * @return
   */
  @RequestMapping("/list")
  public String list(Model model) {
    System.out.printf("===================called");
    List<Student> list = new ArrayList<>();
    list.add(new Student(1, "Tom", 80.5));
    list.add(new Student(2, "Jerry", 90.4));
    list.add(new Student(3, "Paul", 77.5));
    model.addAttribute("list", list);
    return "list";
  }
}