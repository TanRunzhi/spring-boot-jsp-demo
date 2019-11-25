package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

  @RequestMapping("/")
  public String test1(Model model){
    model.addAttribute("haha","233333");
    return "index";
  }

}
