package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zc.utils.DataSourceUtils;
import com.zc.vo.User;

public class UserEditDao {

	public User userEditByID(String id) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where id=?";
		return runner.query(sql, new BeanHandler<User>(User.class), id);
	}

}
