package com.javademo.spring_boot.service;

import java.util.List;
import  com.javademo.spring_boot.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public List<User> getListUser();
}