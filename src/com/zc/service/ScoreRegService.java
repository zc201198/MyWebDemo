package com.zc.service;

import java.sql.SQLException;

import com.zc.dao.ScoreRegDao;
import com.zc.vo.Score;

public class ScoreRegService {

	public boolean saveScore(Score score) {
		ScoreRegDao dao = new ScoreRegDao();
		long isRes=0;
		try {
			isRes = dao.saveScore(score);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isRes>0?true:false;
	}

}
