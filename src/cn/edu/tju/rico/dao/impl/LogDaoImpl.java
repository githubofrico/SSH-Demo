package cn.edu.tju.rico.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dao.LogDao;
import cn.edu.tju.rico.model.entity.Log;

/**        
 * Title: LogDaoImpl.java    
 * Description: 由Spring管理，LogDao的具体实现，在此用的是Hibernate作持久层
 * @author rico       
 * @created 2017年4月24日 上午9:14:19    
 */      
@Component("logDao")
public class LogDaoImpl implements LogDao {
	
	
	/**  由Spring管理   (@author: rico) */      
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	  
	/** 
	 * @description 将处于Transient状态的对象持久化并转为Persistent状态
	 * @author rico       
	 * @created 2017年4月24日 上午9:15:53      
	 * @param log     
	 * @see cn.edu.tju.rico.dao.LogDao#save(cn.edu.tju.rico.model.entity.Log)     
	 */  
	public void save(Log log) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(log);
	}
}
