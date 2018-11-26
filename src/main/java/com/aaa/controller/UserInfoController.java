package com.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;
import com.aaa.service.UserInfoBiz;

/**
 * @author TeacherChen
 * @description 用户业务控制器
 * @company AAA软件
 * @classname Qy78
 * 2018-11-21上午10:03:48
 */
@Controller
@RequestMapping("/userinfo")//窄化请求
public class UserInfoController {
	@Autowired
	private UserInfoBiz userInfoImpl;
	
	@RequestMapping("/findAllUser")
	public String findAllUser(HttpSession session) {
		List<UserInfo> userList = userInfoImpl.findAllUser();
		session.setAttribute("userList", userList);
		
		return "showUser";

	}
	/**
	 * 
	 *TODO 按照条件查询
	 *@param session
	 *@return
	 *2018-11-23上午9:54:01
	 */
	@RequestMapping("/findAllUserCondition")
	public String findAllUserCondition(HttpSession session,MyCondition condition) {
		List<UserInfo> userList = userInfoImpl.findAllUserCondition(condition);
		session.setAttribute("userList", userList);
		return "showUser";
		
	}
	@RequestMapping("/toAddUserPage")
	public  String  toAddUserPage() {
		return "addUser";

	}
	@RequestMapping("/addUser")
	public  String  addUser(UserInfo user) {
		userInfoImpl.eaddUser2(user);
		return "redirect:findAllUser.do";
		
	}

}
