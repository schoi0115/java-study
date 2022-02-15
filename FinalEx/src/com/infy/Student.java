package com.infy;

public class Student {
	private final int STIPEND = 100;
	private int studentId;
	private int aggregateMarks;
	
	public double calculateTotalStipend() {
		double totalStipend = 0.0;
		if(aggregateMarks >= 85 && aggregateMarks< 90) {
			totalStipend = STIPEND + 10;
		}	else if(aggregateMarks >= 90 && aggregateMarks< 95) {
			totalStipend = STIPEND + 15;
		}		else if(aggregateMarks >= 95 && aggregateMarks<= 100) {
			totalStipend = STIPEND + 20;
		} else {
			totalStipend = STIPEND;
		}
		
		return totalStipend;
	}
	


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAggregateMarks() {
		return aggregateMarks;
	}
	public void setAggregateMarks(int aggregateMarks) {
		this.aggregateMarks = aggregateMarks;
	}
	
	public int getSTIPEND() {
		return STIPEND;
	}

	
	

}
