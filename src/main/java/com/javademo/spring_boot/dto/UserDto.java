package com.javademo.spring_boot.dto;

public class UserDto {
	 private int id;
	    private String name;
		private String email;
		private String avatar;
		private String phone;
		public UserDto(int id, String name, String email, String avatar, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.avatar = avatar;
			this.phone = phone;
		}
		public UserDto() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
}
