package com.zc.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zc.utils.DataSourceUtils;
import com.zc.vo.User;

public class UserSelectDao {

	public List<User> findAllUsers() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user";
		return runner.query(sql, new BeanListHandler<User>(User.class));
	}

}
