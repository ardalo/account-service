package com.ardalo.digitalplatform.account.login;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  @GetMapping("/api/pages/login")
  public ModelAndView login() {
    ModelAndView modelAndView = new ModelAndView("login");
    modelAndView.getModel().put("currentTimestamp", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
    return modelAndView;
  }
}
