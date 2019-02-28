package com.cg.dao;

import java.util.HashMap;

import com.cg.bean.Trainer;

public interface FeedbackDAO {
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList();
	
	
	
}
