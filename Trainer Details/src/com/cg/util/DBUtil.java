package com.cg.util;

import java.time.LocalDate;
import java.util.HashMap;

import com.cg.bean.Trainer;

public class DBUtil {
static HashMap<Integer,Trainer> feedbackList=new HashMap<Integer, Trainer>();
    
	

	static{
		feedbackList.put(41,new Trainer("Smitha","Java",LocalDate.of(2009, 04, 10),LocalDate.of(2000, 03, 13),5));
		feedbackList.put(22,new Trainer("Smitha","Java",LocalDate.of(2009, 04, 10),LocalDate.of(2000, 03, 13),4));
		feedbackList.put(43,new Trainer("Smitha","Java",LocalDate.of(2009, 04, 10),LocalDate.of(2000, 03, 13),3));

	}
	public static int getId()
	{
		return (int) (Math.random()*1000);
	}
	
	public static HashMap<Integer, Trainer> getTrainerList() {	
		return  feedbackList;

	}

	

	
}
