package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.StudentRegDao;
import com.zc.vo.Students;

public class StudentRegService {

	public boolean saveStu(Students students) {
		StudentRegDao dao = new StudentRegDao();
		long isRes=0;
		try {
			isRes = dao.saveStu(students);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRes>0?true:false;
	}

}
