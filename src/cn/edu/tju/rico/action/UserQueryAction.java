package cn.edu.tju.rico.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.model.entity.User;
import cn.edu.tju.rico.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

  
/**        
 * Title: UserQueryAction.java    
 * Description: show.jsp 对应的控制器 
 * @author rico       
 * @created 2017年4月24日 上午9:07:29    
 */      
@SuppressWarnings("serial")
@Component("userQuery")
@Scope("prototype")  // 每个请求对应一个Action对象
public class UserQueryAction extends ActionSupport{

	private int id;
	private UserService userService;
	
	// 存储业务处理结果
	private User user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		user = userService.getUser(id);
		System.out.println(user);
		return Action.SUCCESS;
	}
}
