package cn.edu.tju.rico.dao;

import java.util.List;

import cn.edu.tju.rico.model.entity.User;

public interface UserDao {
	
	public List<User> getUserByName(String uname);
	
	public void save(User user);
	
	public User loadUser(int id);
}
