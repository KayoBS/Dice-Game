package com.dice_game.demo.controller;

import com.dice_game.demo.services.*;
import com.dice_game.demo.controller.HomeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMappine("/hello-world")
@RequestMapping("/hello")
public class HelloWorldController {

  private HelloWorldService helloWorldService;

  public HelloWorldController(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

  @GetMapping
  public String helloWorld() {
    return helloWorldService.helloWorld("Kayo");
  }
}
