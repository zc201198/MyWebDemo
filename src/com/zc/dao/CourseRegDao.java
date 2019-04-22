package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zc.utils.DataSourceUtils;
import com.zc.vo.Course;

public class CourseRegDao {

	public long saveCourse(Course course) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into course values(?,?,?)";
		int update = runner.update(sql, course.getId(),course.getName(),course.getTeacher());
		return update;
	}

}
