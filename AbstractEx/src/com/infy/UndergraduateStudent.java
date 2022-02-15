package com.infy;

public class UndergraduateStudent extends Student {
	
	public UndergraduateStudent(String studentName) {
		super(studentName);
//		Initialize the instance variable studentName with the value passed to the constructor and other instance variables to the default values

	}

	@Override
	public void generateResult() {
		int average = 0;
		int testTotal = 0;
		for (int testScore : getTestScores()) { // you can you super.getTestScores() or this.getTestScores() or  just getTestScores()
			testTotal += testScore;
		}
		average = testTotal / super.getTestScores().length;
		if (average >= 60) {
			super.setTestResult("Pass");
		} else {
			super.setTestResult("Fail");
		}
	}


}
