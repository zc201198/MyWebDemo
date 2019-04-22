package com.zc.service;


import java.sql.SQLException;

import com.zc.dao.LoginDao;
import com.zc.vo.User;

public class LoginService {

	public User login(String username, String password) throws SQLException {
		LoginDao dao = new LoginDao();
		return dao.login(username, password);
	}
	
}
