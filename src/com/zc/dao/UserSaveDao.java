package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zc.utils.DataSourceUtils;
import com.zc.utils.MD5UtilsCalcu;
import com.zc.vo.User;

public class UserSaveDao {

	public long saveUserByID(User user, String id) throws SQLException {
		QueryRunner runner=new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update user set name=?,password=?,sex=?,age=?,record=?,telephone=?,email=? where id=?";
		int update = runner.update(sql, user.getName(),MD5UtilsCalcu.md5(user.getPassword()),user.getSex(),user.getAge(),user.getRecord(),user.getTelephone(),user.getEmail(),id);
		return update;
	}

}
