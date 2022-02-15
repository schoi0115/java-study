package com.infy;

public class Student {
	private String studentName;
	private int[] testScores;
	private String testResult;

	public Student(String studentName) {
		this.studentName = studentName;
//		Initialize the instance variable studentName with the value passed to the constructor and other instance variables to the default values.
		this.testScores = new int[4];
	}

	public void generateResult() {
		
	};

	public void setTestScore(int testNumber, int testScore) {
		this.testScores[testNumber] = testScore;
//		Set the value of the testScore in the appropriate position of testScores array based on the testNumber.
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getTestScores() {
		return testScores;
	}

//	public void setTestScores(int[] testScores) {
//		this.testScores = testScores;
//	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

}
