package com.cg.view;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.bean.Trainer;
import com.cg.dao.FeedbackDAO;
import com.cg.dao.FeedbackDAOImpl;
import com.cg.exception.InvalidCourseNameException;
import com.cg.exception.InvalidNameException;
import com.cg.exception.InvalidRatingException;
import com.cg.service.FeedbackService;
import com.cg.service.FeedbackServiceImpl;

public class Main {

	public static void main(String[] args) throws InvalidNameException, InvalidCourseNameException, InvalidRatingException {
		Scanner sc=new Scanner(System.in);
		FeedbackDAO fRepo=new FeedbackDAOImpl();
		FeedbackService fService=new FeedbackServiceImpl(fRepo);
		while(true)
		{
			System.out.println("Choose Option");
			System.out.println("1.Enter trainer details");
			System.out.println("2.Display details");
			System.out.println("3.Exit");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: 
				System.out.println("Enter name");
				String name=sc.nextLine();
				System.out.println("Enter Course Name");
				String courseName=sc.nextLine();
				System.out.println("Enter Start date");
				int sd=sc.nextInt();
				int sm=sc.nextInt();
				int sy=sc.nextInt();

				System.out.println("Enter end date");
				int ed=sc.nextInt();
				int em=sc.nextInt();
				int ey=sc.nextInt();
				System.out.println("Enter rating");
				int r=sc.nextInt();
				sc.nextLine();
				if(fService.validateName(name) )
				{
					if(fService.validateCourseName(courseName))
					{
						if(fService.validateRating(r))
						{
							Trainer trainer=new Trainer(name,courseName,LocalDate.of(sy, sm, sd),LocalDate.of(ey, em, ed),r);
							fService.addFeedback(trainer);
							System.out.println("details entered correctly");
						}
						else
						{
							System.out.println("wrong rating entered");
						}
					}
					else
					{
						System.out.println("wrong coursename is entered");
					}
				}
				else
				{
					System.out.println("wrong name is entered");
				}
				break;
			case 2:
				System.out.println("Details : " + fService.getTrainerList());
				break;
			}



		}


	}

}
