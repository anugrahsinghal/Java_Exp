package com.example.helloworld.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {
  
  Logger log = LoggerFactory.getLogger(HelloServlet.class);
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("Running Hello Servlet");
  }
  
  
}
