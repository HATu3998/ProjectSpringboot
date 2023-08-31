package com.javademo.spring_boot.api;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

 

@RestController

public class NewAPI {

       @GetMapping("/test")

       public String testAPI() {

             return "success";

   }

}