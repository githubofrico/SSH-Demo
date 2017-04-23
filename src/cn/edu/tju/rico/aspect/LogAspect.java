package cn.edu.tju.rico.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Around("execution(* cn.edu.tju.rico.service.impl.UserServiceImpl.*(..))")
	public Object printLog(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("开始记录日志...");
		
		// 获取目标方法的参数
		Object[] args = jp.getArgs();
		
		// 获取目标方法的返回值
		Object rvt = jp.proceed(args);
		
		//打印系统执行信息： 目标对象+目标方法
		System.out.println("系统正在执行方法： " + jp.getTarget().getClass().getName()
				+ "." + jp.getSignature().getName());
		System.out.println("日志记录完毕... ");
		
		return rvt;
	}
}
