package com.zc.service;

import java.sql.SQLException;
import java.util.List;

import com.zc.dao.UserSelectDao;
import com.zc.vo.User;

public class UserSelectService {

	public List<User> findAllUsers() {
		UserSelectDao dao = new UserSelectDao();
		List<User> userList = null;
		try {
			userList = dao.findAllUsers();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

}
