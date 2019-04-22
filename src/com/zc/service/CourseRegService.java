package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.CourseRegDao;
import com.zc.vo.Course;

public class CourseRegService {

	public boolean saveCourse(Course course) {
		CourseRegDao dao = new CourseRegDao();
		long isRes=0;
		try {
			isRes = dao.saveCourse(course);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRes>0?true:false;
	}

}
