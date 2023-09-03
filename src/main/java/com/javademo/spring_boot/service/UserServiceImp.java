package com.javademo.spring_boot.service;

import org.springframework.stereotype.Component;
import java.util.*;

import com.javademo.spring_boot.dto.UserDto;
import  com.javademo.spring_boot.entity.User;
import com.javademo.spring_boot.mapper.UserMapper;
@Component
public class UserServiceImp implements UserService {

	private static ArrayList<User> users=new ArrayList<User>();
	
	static {
		users.add(new User(1,"nguyễn văn a","a@gmail.com","avatar.img","012345678","abc123"));
		users.add(new User(2,"lê văn lương","b@gmail.com","avatar.img","012345678","abc123"));
		users.add(new User(3,"đào thị hường","c@gmail.com","avatar.img","012345678","abc123"));
		users.add(new User(4,"huỳnh quốc cường","d@gmail.com","avatar.img","012345678","abc123"));
	}

	public List<UserDto> getListUser() {
		// TODO Auto-generated method stub
		List<UserDto> rs=new ArrayList<UserDto>();
		for(User u:users) {
			rs.add(UserMapper.toUserDto(u));
		}
		return rs;
	}

	public UserDto getUserById(int id) {
	for(User u:users) {
		if(u.getId()==id) {
			return UserMapper.toUserDto(u);
		}
	}
		return null;
	}

	public List<UserDto> searchListUser(String keyword) {
		List<UserDto> rs=new ArrayList<UserDto>();
		for(User u:users) {
			if(u.getName().contains(keyword)) {
				rs.add(UserMapper.toUserDto(u));
			}
		}
		return rs;
	}
}
