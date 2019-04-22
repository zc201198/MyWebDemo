package com.zc.service;

import java.sql.SQLException;
import com.zc.dao.UserResDao;
import com.zc.vo.User;

public class UserResService {

	public boolean saveUser(User user) {
		UserResDao dao = new UserResDao();
		long isRes=0;
		try {
			isRes = dao.saveUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRes>0?true:false;
	}

}
