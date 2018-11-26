package com.aaa.aop;

import org.springframework.stereotype.Component;

/**
 * @author TeacherChen
 * @description 业务实现类,目标对象
 * @company AAA软件
 * @classname Qy78
 * 2018-11-23上午11:25:19
 */
public class PhoneBizImpl implements PhoneBiz {

	@Override
	public void buyPhone(int num) {
		System.out.println("手机进货："+num+"部");

	}

	@Override
	public void salePhone(int num) throws MyExecption {
		if(num>1000){
			throw new MyExecption("数量不足");
		}
		System.out.println("手机销售："+num+"部");

	}

}
