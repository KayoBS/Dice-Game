package com.dice_game.game.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @GetMapping("/bet")
  public String bet() {
    return "bets";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }
}
