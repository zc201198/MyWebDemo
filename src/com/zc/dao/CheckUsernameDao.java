package com.zc.dao;

import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import com.zc.utils.DataSourceUtils;

public class CheckUsernameDao {

	public long checkUsername(String username) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select count(*) from user where name=?";
		long query = (long) runner.query(sql, new ScalarHandler(), username);	
		return query;
	}

}
