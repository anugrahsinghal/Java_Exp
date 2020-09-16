package com.udacity.springbootexceptions.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RoleController {
  @RequestMapping("/roleadd")
  public String add() {
    int num = 10 / 0;
    return "add";
  }
  
  public static void main(String[] args) {
    System.out.println(trial());
  }
  
  private static ArrayList trial() {
    List<String> s = Arrays.asList("{\"a\":\"b\"}", "{\"a\":\"d\"}");
    
    JSONObject jsonObject = new JSONObject();
    List<JSONObject> collect = s.stream()
        .map(RoleController::getJSON)
        .filter(e -> {
          try {
            return e.getString("a").equals("b") || e.getString("a").equals("d");
          } catch (JSONException ex) {
            ex.printStackTrace();
          }
          return false;
        })
        .collect(Collectors.toList());
    
    
    return (ArrayList) collect;
  }
  
  private static JSONObject getJSON(String s) {
    try {
      return new JSONObject(s);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return null;
  }
}
