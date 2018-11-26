package com.aaa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * @author TeacherChen
 * @description 日志切面类
 * @company AAA软件
 * @classname Qy78
 * 2018-11-23上午11:35:59
 */
public class LogAspect {
	
	/**
	 * 销售手机之前打印日志
	 *TODO 
	 *2018-11-23上午11:36:31
	 */
	public void beforeMethod(JoinPoint jp) {
		Object[] args = jp.getArgs();//手机的数量，一个参数
		String name = jp.getSignature().getName();//返回切入点方法的名称
		System.out.println("日志：前置通知"+name+"数量："+args[0]);
		

	}
	/**
	 * 销售手机之后打印日志
	 *TODO 
	 *2018-11-23上午11:36:31
	 */
	public void xxxafterReturingMethod(JoinPoint jp) {
		Object[] args = jp.getArgs();//手机的数量，一个参数
		String name = jp.getSignature().getName();//返回切入点方法的名称
		System.out.println("日志：后置通知"+name+"数量："+args[0]);
		
		
	}
	/**
	 * 销售手机结束打印日志
	 *TODO 
	 *2018-11-23上午11:36:31
	 */
	public void xxxafterMethod(JoinPoint jp) {
		Object[] args = jp.getArgs();//手机的数量，一个参数
		String name = jp.getSignature().getName();//返回切入点方法的名称
		System.out.println("日志：最终通知"+name+"数量："+args[0]);
		
		
	}
	/**
	 * 销售手机库存不足的时候打印日志
	 *TODO 
	 *2018-11-23上午11:36:31
	 */
	public void throwExceptionMethod(JoinPoint jp,MyExecption e) {
		Object[] args = jp.getArgs();//手机的数量，一个参数
		String name = jp.getSignature().getName();//返回切入点方法的名称
		System.out.println("日志：异常通知"+name+"数量："+args[0]);
		
		
	}
	/**
	 * 销售手机前后打印日志
	 *TODO 
	 *2018-11-23上午11:36:31
	 */
	public void aroundMethod(ProceedingJoinPoint jp) {
		Object[] args = jp.getArgs();
		String name = jp.getSignature().getName();
		System.out.println("环绕方法前："+name+"参数："+args[0]);
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("环绕方法后："+name+"参数："+args[0]);
	}
	
	
	

}
