package com.my.example.demo.endpoint.rest.controller.health;

import com.example.demo.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
public class HelloWorldController {

  @GetMapping("/hello")
  public String helloWorld() {
    return "... world!";
  }
}
