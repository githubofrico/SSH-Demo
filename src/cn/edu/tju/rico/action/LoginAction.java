package cn.edu.tju.rico.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.edu.tju.rico.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@Component("login")
@Scope("prototype")
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware {

	private String uname;
	private String passwd;
	private UserService userService;
	private Map<String, Object> session;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public UserService getUserService() {
		return userService;
	}

	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		boolean flag = userService.login(uname, passwd);
		if(flag){
			session.put("uname", uname);
		}
		return flag ? Action.SUCCESS : Action.ERROR;
	}

	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
}
