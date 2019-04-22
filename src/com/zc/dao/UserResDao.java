package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zc.utils.DataSourceUtils;
import com.zc.vo.User;

public class UserResDao {

	public long saveUser(User user) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into user values(?,?,?,?,?,?,?,?)";
		int update = runner.update(sql, user.getId(),user.getName(),user.getPassword(),user.getSex(),user.getAge(),user.getRecord(),user.getTelephone(),user.getEmail());
		return update;
	}

}
