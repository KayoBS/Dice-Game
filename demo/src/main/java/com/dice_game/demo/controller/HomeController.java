package com.dice_game.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "This is the home page";
  }
}
