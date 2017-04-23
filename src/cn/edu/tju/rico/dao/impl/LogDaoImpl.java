package cn.edu.tju.rico.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dao.LogDao;
import cn.edu.tju.rico.model.entity.Log;

@Component("logDao")
public class LogDaoImpl implements LogDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(Log log) {
		// TODO Auto-generated method stub
		System.out.println("2 " + log);
		hibernateTemplate.save(log);
	}
}
