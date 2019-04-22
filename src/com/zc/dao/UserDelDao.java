package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zc.utils.DataSourceUtils;

public class UserDelDao {

	public long userDelByID(String id) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "delete from user where id=?";
		int update = runner.update(sql, id);
		return update;
	}

}
