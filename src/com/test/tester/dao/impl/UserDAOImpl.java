package com.test.tester.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.tester.servlet.InitServlet;

public class UserDAOImpl implements UserDAO {

	@Override
	public int insertUserInfo(Map<String, Object> ui) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserInfo(Map<String, Object> ui) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUserInfo(Map<String, Object> ui) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> selectUserInfo(Map<String, Object> ui) {
		Map<String, Object> map = new HashMap<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = InitServlet.getConnection();
		String sql = "select * from user_info where id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,Integer.parseInt(ui.get("ui_num").toString()));
			rs = ps.executeQuery();
			if(rs.next()) {
				map.put("ui_num", rs.getInt("ui_num"));
				map.put("ui_name", rs.getString("ui_name"));
				map.put("ui_age", rs.getInt("ui_age"));
				map.put("ui_birth", rs.getString("ui_birth"));
				map.put("ui_id", rs.getString("ui_id"));
				map.put("ui_password", rs.getString("ui_password"));
				map.put("ui_phone", rs.getString("ui_phone"));
				map.put("ui_email", rs.getString("ui_email"));
				map.put("ui_credat", rs.getString("ui_credat"));
				map.put("ui_nickname", rs.getString("ui_nickname"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
					InitServlet.close(rs, ps, con);
		}
		
		return map;
	}

	@Override
	public Map<String, Object> selectUserInfoByUiId(String uiId) {
		Map<String, Object> ui = new HashMap<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select ui_num, ui_name, ui_age, ui_birth, ui_id, ui_password, ui_phone,"
				+ " ui_email, ui_credat, ui_nickname from user_info where ui_id=?";
		con = InitServlet.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, uiId);
			rs = ps.executeQuery();
			if(rs.next()) {
				ui.put("ui_num", rs.getInt("ui_num"));
				ui.put("ui_name", rs.getString("ui_name"));
				ui.put("ui_age", rs.getInt("ui_age"));
				ui.put("ui_birth", rs.getString("ui_birth"));
				ui.put("ui_id", rs.getString("ui_id"));
				ui.put("ui_password", rs.getString("ui_password"));
				ui.put("ui_phone", rs.getString("ui_phone"));
				ui.put("ui_email", rs.getString("ui_email"));
				ui.put("ui_credat", rs.getString("ui_credat"));
				ui.put("ui_nickname", rs.getString("ui_nickname"));
				return ui;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			InitServlet.close(rs, ps, con);
		}
		return ui;
		}

	@Override
	public List<Map<String, Object>> selectUserInfoList(Map<String, Object> ui) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		InitServlet is = new InitServlet() ;
		is.init();
		UserDAO user = new UserDAOImpl();
		System.out.println(user.selectUserInfoByUiId("2"));
	}
	

	
}
