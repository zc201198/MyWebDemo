package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.UserEditDao;
import com.zc.vo.User;

public class UserEditService {

	public User userEditByID(String id) {
		UserEditDao dao = new UserEditDao();
		User user = null;
		try {
			user = dao.userEditByID(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
