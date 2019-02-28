package com.cg.service;

import java.util.HashMap;

import com.cg.bean.Trainer;
import com.cg.exception.InvalidCourseNameException;
import com.cg.exception.InvalidNameException;
import com.cg.exception.InvalidRatingException;

public interface FeedbackService {
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList();
	public boolean validateName(String name) ;
	public boolean validateCourseName(String courseName) ;
	public boolean validateRating(int r);
}
