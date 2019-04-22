package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.UserDelDao;

public class UserDelService {

	public boolean userDelByID(String id) {
		UserDelDao dao = new UserDelDao();
		long isRes=0;
		try {
			isRes = dao.userDelByID(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRes>0?true:false;
	}

}
