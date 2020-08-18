package com.test.tester.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.test.tester.dao.impl.UserDAO;
import com.test.tester.dao.impl.UserDAOImpl;
import com.test.tester.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO ud = new UserDAOImpl();
	@Override
	public Map<String, Object> dologin(Map<String, String> user) {
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "아이디를 확인해 주세요");
		map.put("result", "fail");
		String uiId = user.get("uiId");
		Map<String,Object> tmpUser = ud.selectUserInfoByUiId(uiId);
		if(tmpUser!=null) {
			String tmpPwd = tmpUser.get("ui_password").toString();
			String uiPwd = user.get("ui_password");
			if(tmpPwd.equals(uiPwd)) {
				map.put("msg", "로그인 완료");
				map.put("result", "ok");
				map.put("user", tmpUser);
			}
		}
		return map;
	}

	@Override
	public Map<String, Object> joinUserInfo(Map<String, Object> user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> checkId(String uiId) {
		// TODO Auto-generated method stub
		return null;
	}

}
