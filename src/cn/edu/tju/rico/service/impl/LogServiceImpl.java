package cn.edu.tju.rico.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dao.LogDao;
import cn.edu.tju.rico.model.entity.Log;
import cn.edu.tju.rico.service.LogService;

  
/**        
 * Title: LogServiceImpl.java    
 * Description: LogService 的逻辑实现类
 * @author rico       
 * @created 2017年4月24日 上午9:30:33    
 */      
@Component("logService")
public class LogServiceImpl implements LogService{
	
	/**  由Spring容器管理   (@author: rico) */      
	private LogDao logDao;
	
	public LogDao getLogDao() {
		return logDao;
	}

	@Resource(name="logDao")
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	/** 
	 * @description 日志保存
	 * @author rico       
	 * @created 2017年4月24日 上午9:31:19      
	 * @param log     
	 * @see cn.edu.tju.rico.service.LogService#add(cn.edu.tju.rico.model.entity.Log)     
	 */  
	public void add(Log log) {
		// TODO Auto-generated method stub
		logDao.save(log);
	}
}
