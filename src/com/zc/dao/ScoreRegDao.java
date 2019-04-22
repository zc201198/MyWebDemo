package com.zc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zc.utils.DataSourceUtils;
import com.zc.vo.Score;

public class ScoreRegDao {

	public long saveScore(Score score) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into score values(?,?,?)";
		int update = runner.update(sql, score.getId(),score.getName(),score.getResults());
		return update;
	}

}
