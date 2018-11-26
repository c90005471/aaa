package com.aaa.aop;

import java.util.Date;

/**
 * @author TeacherChen
 * @description 日志工具类
 * @company AAA软件
 * @classname Qy78
 * 2018-11-23上午11:26:15
 */
public class LogUtil {
	public void log(String type, int num) {
		System.out.println(new Date()+":"+type+"手机"+num+"部");

	}

}
