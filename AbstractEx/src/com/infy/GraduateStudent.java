package com.infy;

public class GraduateStudent extends Student {

	public GraduateStudent(String studentName) {
		super(studentName);
		
	}

	@Override
	public void generateResult() {
		int average = 0;
		int testTotal = 0;
		for (int testScore : getTestScores()) {
			testTotal += testScore;
		}
		average = testTotal / getTestScores().length;
		if (average >= 70) {
			super.setTestResult("Pass");
		} else {
			super.setTestResult("Fail");
		}
		
	}
	

}
