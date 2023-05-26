package com.foodRecipe.recipeBook.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/demo-unsecured")
    public ResponseEntity<String> sayHelloUnsecured() {
        return ResponseEntity.ok("Hello from unsecured endpoint");
    }

    @GetMapping("/demo-secured")
    public ResponseEntity<String> sayHelloSecured() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
