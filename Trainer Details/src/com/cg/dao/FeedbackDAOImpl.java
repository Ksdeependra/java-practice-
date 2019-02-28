package com.cg.dao;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import com.cg.bean.Trainer;
import com.cg.util.DBUtil;

public class FeedbackDAOImpl implements FeedbackDAO {
	@Override
	public void addFeedback(Trainer trainer) {
		HashMap<Integer,Trainer> hm=DBUtil.getTrainerList();
		hm.put(DBUtil.getId(),trainer);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList() {
		return DBUtil.getTrainerList();
		
		
	}

	
	

}
