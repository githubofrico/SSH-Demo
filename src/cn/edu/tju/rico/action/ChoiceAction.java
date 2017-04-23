package cn.edu.tju.rico.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("choice")
@Scope("prototype")
@SuppressWarnings("serial")
public class ChoiceAction extends ActionSupport {
	
	public String login() {
		return "login";
	}

	public String regist() {
		return "regist";
	}
}
