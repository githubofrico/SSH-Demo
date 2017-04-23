package cn.edu.tju.rico.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dao.UserDao;
import cn.edu.tju.rico.model.entity.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByName(String uname) {
		// TODO Auto-generated method stub
		List<User> list = hibernateTemplate
				.find("from User u where u.uname = '" + uname + "'");
		return list;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
	}

	@SuppressWarnings("unchecked")
	public User loadUser(int id) {
		// TODO Auto-generated method stub
		User user = (User) hibernateTemplate.load(User.class, id);
		return user;
	}
}
