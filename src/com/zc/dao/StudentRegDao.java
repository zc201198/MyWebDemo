package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zc.utils.DataSourceUtils;
import com.zc.vo.Students;

public class StudentRegDao {

	public long saveStu(Students students) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into students values(?,?,?,?,?,?,?,?)";
		int update = runner.update(sql, students.getStudentid(),students.getName(),students.getBanji(),students.getSex(),students.getProfessional(),students.getDept(),students.getAge(),students.getTelephone());
		return update;
	}

}
