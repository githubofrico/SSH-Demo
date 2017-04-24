package cn.edu.tju.rico.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.dto.UserDTO;
import cn.edu.tju.rico.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

  
/**        
 * Title: RegistAction.java    
 * Description:regist.jsp 对应的控制器 
 * @author rico       
 * @created 2017年4月24日 上午9:05:47    
 */      
@Component("regist")
@Scope("prototype")// 每个请求对应一个Action对象
@SuppressWarnings("serial")
public class RegistAction extends ActionSupport {

	private UserDTO userDTO;  // DTO：Data Transfer Object，用于传值，不作持久化(包含确认密码的User)
	private UserService userService;

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		boolean flag = userService.regist(userDTO);
		return flag ? Action.SUCCESS : Action.ERROR;
	}
}