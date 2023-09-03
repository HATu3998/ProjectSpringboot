package com.javademo.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javademo.spring_boot.dto.UserDto;
import com.javademo.spring_boot.entity.User;
import com.javademo.spring_boot.service.UserService;

@RestController
public class UserController {
	@Autowired
 private UserService userService;
	@GetMapping("/user")
	public ResponseEntity<?> getListEntity(){
		List<UserDto> users=userService.getListUser();
		return ResponseEntity.ok(users);
	}
//	@GetMapping("/user")
//	public ResponseEntity<?> getListbyId(){
//		return null;
//	}
	@PostMapping("/user")
	public ResponseEntity<?> createListEntity(){
		return null;
	}
	@PutMapping("/user/{id}")
	public ResponseEntity<?> updateListEntity(){
		return null;
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteListEntity(){
		return null;
	}
}
