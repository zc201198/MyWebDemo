package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.CheckUsernameDao;

public class CheckUsernameService {

	public boolean checkUsername(String username) throws SQLException {
		CheckUsernameDao dao = new CheckUsernameDao();
		long isExist=0;
		isExist =dao.checkUsername(username);
		
		return isExist>0?true:false;
	}

}
