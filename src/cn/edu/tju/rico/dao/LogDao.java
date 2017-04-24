package cn.edu.tju.rico.dao;

import cn.edu.tju.rico.model.entity.Log;
  
/**        
 * Title: LogDao.java    
 * Description: 面对接口编程，屏蔽具体的数据库访问操作
 * @author rico       
 * @created 2017年4月24日 上午9:11:27    
 */      
public interface LogDao {
	
	/**     
	 * @description 日志持久化
	 * @author rico       
	 * @created 2017年4月24日 上午9:12:10     
	 * @param log     
	 */
	public void save(Log log);
}
