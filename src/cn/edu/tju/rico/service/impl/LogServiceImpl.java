package cn.edu.tju.rico.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dao.LogDao;
import cn.edu.tju.rico.model.entity.Log;
import cn.edu.tju.rico.service.LogService;

@Component("logService")
public class LogServiceImpl implements LogService{

	private LogDao logDao;
	
	public LogDao getLogDao() {
		return logDao;
	}

	@Resource(name="logDao")
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public void add(Log log) {
		// TODO Auto-generated method stub
		logDao.save(log);
	}

}
