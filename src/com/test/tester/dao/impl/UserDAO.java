package com.test.tester.dao.impl;

import java.util.List;
import java.util.Map;

public interface UserDAO {

	int insertUserInfo(Map<String,Object> ui);
	int updateUserInfo(Map<String,Object> ui);
	int deleteUserInfo(Map<String,Object> ui);
	Map<String,Object> selectUserInfo(Map<String,Object> ui);
	Map<String,Object> selectUserInfoByUiId(String uiId);
	List<Map<String,Object>> selectUserInfoList(Map<String,Object> ui);
}
