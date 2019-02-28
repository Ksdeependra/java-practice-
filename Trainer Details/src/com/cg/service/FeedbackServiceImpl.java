package com.cg.service;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.bean.Trainer;
import com.cg.dao.FeedbackDAO;
import com.cg.exception.InvalidCourseNameException;
import com.cg.exception.InvalidNameException;
import com.cg.exception.InvalidRatingException;

public class FeedbackServiceImpl implements  FeedbackService{
	
	FeedbackDAO fRepo;
	
     public FeedbackServiceImpl(FeedbackDAO fRepo) {
    	 this.fRepo=fRepo;
	}

	@Override
	public void addFeedback(Trainer trainer) {
		fRepo.addFeedback(trainer);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList() {
		return fRepo.getTrainerList();
		
	}

	@Override
	public boolean validateName(String name) {
		
		Pattern p=Pattern.compile("[A-Za-z]{1,20}");
		Matcher m=p.matcher(name);
		if(!(m.matches()))
		{
			return false;
		}
		return true;
		
		
	}

	@Override
	public boolean validateCourseName(String courseName)  {
		
		Pattern p=Pattern.compile("[A-Za-z]{1,20}");
		Matcher m=p.matcher(courseName);
		if(!(m.matches())) {
			return false;
		}
		return true;	
		
	}

	@Override
	public boolean validateRating(int r)  {
		if(r<0 && r>5)
		{
			return false;
		}
		return true;
		
	}


	

}
