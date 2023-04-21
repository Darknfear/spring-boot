package pga.com.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pga.com.api.common.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("auth")
public class AuthController {
  @GetMapping
  public ResponseEntity<List<String>> getAlls() {
    return new ResponseEntity<List<String>>(true, "Get all successfully!", List.of("a", "b"));
  }
}
