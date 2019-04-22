package com.zc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import com.zc.utils.DataSourceUtils;
import com.zc.utils.MD5UtilsCalcu;
import com.zc.vo.User;

public class LoginDao{

	public User login(String username, String password) throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection con = DataSourceUtils.getConnection();
		String sql = "select * from user where name = ? and password = ?";
		return runner.query(con, sql, new BeanHandler<User>(User.class), username, MD5UtilsCalcu.md5(password));
	}


}
