package org.automation.autotesting;

public class OnlineExam {
	public  String checkEligibility(int percentage, boolean assignmentStatus) {
		
		if (percentage>=75)
		{
			if (assignmentStatus==true)
			{
				return "Eligible for Exam";
			}
			else {
				return "Submit Assignment";
			}
		}
			else {
				return "Attendance Shortage";
			}
		}
		public static void main(String[] args) {
			OnlineExam oe = new OnlineExam();
			System.out.println("Result:"+oe.checkEligibility(80, false));
		}
	}


