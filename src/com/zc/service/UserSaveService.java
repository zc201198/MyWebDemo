package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.UserSaveDao;
import com.zc.vo.User;

public class UserSaveService {

	public boolean saveUserByID(User user, String id) {
		UserSaveDao dao = new UserSaveDao();
		long isSav=0;
		try {
			isSav = dao.saveUserByID(user,id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSav>0?true:false;
	}

}
