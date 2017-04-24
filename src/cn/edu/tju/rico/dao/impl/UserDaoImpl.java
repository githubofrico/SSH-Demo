package cn.edu.tju.rico.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dao.UserDao;
import cn.edu.tju.rico.model.entity.User;

/**
 * Title: UserDaoImpl.java Description: 由Spring管理，LogDao的具体实现，在此用的是Hibernate作持久层
 * 
 * @author rico
 * @created 2017年4月24日 上午9:18:24
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {

	/** 由Spring管理 (@author: rico) */
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name = "hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * @description ORM操作，根据uname获取对应的User
	 * @author rico
	 * @created 2017年4月24日 上午9:19:08
	 * @param uname
	 * @return
	 * @see cn.edu.tju.rico.dao.UserDao#getUserByName(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUserByName(String uname) {
		// TODO Auto-generated method stub
		List<User> list = hibernateTemplate
				.find("from User u where u.uname = '" + uname + "'");
		return list;
	}

	/**
	 * @description ORM操作，将 user持久化
	 * @author rico
	 * @created 2017年4月24日 上午9:19:42
	 * @param user
	 * @see cn.edu.tju.rico.dao.UserDao#save(cn.edu.tju.rico.model.entity.User)
	 */
	public void save(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
	}

	/**
	 * @description ORM操作，获取/加载持久层特定Id的User
	 * @author rico
	 * @created 2017年4月24日 上午9:19:52
	 * @param id
	 * @return
	 * @see cn.edu.tju.rico.dao.UserDao#loadUser(int)
	 */
	@SuppressWarnings("unchecked")
	public User loadUser(int id) {
		// TODO Auto-generated method stub
		User user = (User) hibernateTemplate.load(User.class, id);
		return user;
	}
}
