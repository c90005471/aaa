package com.aaa.dao;

import java.util.List;

import com.aaa.entity.MyCondition;
import com.aaa.entity.UserInfo;

public interface UserInfoDao {
	List<UserInfo>findAllUser();
	List<UserInfo>findAllUserCondition(MyCondition condition);
	void addUser(UserInfo user);
}
