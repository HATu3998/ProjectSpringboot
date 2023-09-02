package com.javademo.spring_boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.javademo.spring_boot.entity.*;

@RestController
public class Controller {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public ResponseEntity<?> hello() {
        User u = new User(1, "hh");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(u);
    }
}
