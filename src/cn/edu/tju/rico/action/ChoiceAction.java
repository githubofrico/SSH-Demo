package cn.edu.tju.rico.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

  
/**        
 * Title: 注册/登录   
 * Description: index.jsp对应的控制器
 * @author rico       
 * @created 2017年4月24日 上午9:02:12    
 */      
@Component("choice")
@Scope("prototype")  // 每个请求对应一个Action对象
@SuppressWarnings("serial")
public class ChoiceAction extends ActionSupport {
	
	  
	/**     
	 * @description 选择登录操作
	 * @author rico       
	 * @created 2017年4月24日 上午9:03:05     
	 * @return     
	 */
	public String login() {
		return "login";
	}
	  
	/**     
	 * @description 选择注册操作
	 * @author rico       
	 * @created 2017年4月24日 上午9:03:25     
	 * @return     
	 */
	public String regist() {
		return "regist";
	}
}
