package com.javademo.spring_boot.mapper;

import com.javademo.spring_boot.dto.UserDto;
import com.javademo.spring_boot.entity.User;

public class UserMapper {

	public static UserDto toUserDto(User user) {
		UserDto tmp=new UserDto();
		tmp.setId(user.getId());
		tmp.setName(user.getName());
		tmp.setPhone(user.getPhone());
		tmp.setEmail(user.getEmail());
		tmp.setAvatar(user.getAvatar());
		return tmp;
	}
}
