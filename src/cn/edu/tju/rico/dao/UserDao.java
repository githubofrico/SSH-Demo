package cn.edu.tju.rico.dao;

import java.util.List;

import cn.edu.tju.rico.model.entity.User;

  
/**        
 * Title: UserDao.java    
 * Description: 面对接口编程，屏蔽具体的数据库访问操作
 * @author rico       
 * @created 2017年4月24日 上午9:12:27    
 */      
public interface UserDao {
	
	  
	/**     
	 * @description 根据uname获取对应的User
	 * @author rico       
	 * @created 2017年4月24日 上午9:12:45     
	 * @param uname
	 * @return     
	 */
	public List<User> getUserByName(String uname);
	
	/**     
	 * @description 将 user持久化
	 * @author rico       
	 * @created 2017年4月24日 上午9:13:17     
	 * @param user     
	 */
	public void save(User user);
	
	
	/**     
	 * @description 获取/加载持久层特定Id的User
	 * @author rico       
	 * @created 2017年4月24日 上午9:13:34     
	 * @param id
	 * @return     
	 */
	public User loadUser(int id);
}
