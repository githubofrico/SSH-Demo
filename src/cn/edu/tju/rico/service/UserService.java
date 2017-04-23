package cn.edu.tju.rico.service;

import cn.edu.tju.rico.dto.UserDTO;
import cn.edu.tju.rico.model.entity.User;

public interface UserService {
	
	public boolean login(String uname, String passwd);
	
	public boolean regist(UserDTO userDto);
	
	public User getUser(int id); 
}
