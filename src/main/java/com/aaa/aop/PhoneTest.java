package com.aaa.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneTest {

	/**
	 *TODO 
	 *@param args
	 *2018-11-23上午11:30:06
	 * @throws MyExecption 
	 */
	public static void main(String[] args) throws MyExecption {
		/*PhoneBiz pb = new LogPhoneProxy();
		pb.buyPhone(200);*/
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		PhoneBiz pb = (PhoneBiz) ac.getBean("phoneBizImpl");
		pb.salePhone(400);
		pb.buyPhone(300);

	}

}
