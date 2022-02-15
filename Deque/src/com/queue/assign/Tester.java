package com.queue.assign;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Tester {

	public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {
	    
		    //Implement your logic here and change the return statement accordingly
		List<Deque<Patient>> senior = new Deque<Patient>();
		List<Patient> normal = new ArrayList<Patient>();
		System.out.println(patientsQueue.peekFirst().getAge());
		if (patientsQueue.peek().getAge() < 65) {
		
			
	
		}
	    return senior;
		}

	public static void main(String[] args) {

		Patient patient1 = new Patient("Jack", "Male", 25);
		Patient patient2 = new Patient("Tom", "Male", 64);
		Patient patient3 = new Patient("Simona", "Female", 24);

		Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);

		List<Deque<Patient>> queuesList = splitQueue(patientsQueue);

		int counter = 0;
		for (Deque<Patient> queue : queuesList) {
			if (counter == 0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");

			for (Patient patient : queue) {
				System.out.println("Name : " + patient.getName());
				System.out.println("Age : " + patient.getAge());
				System.out.println();
			}
			counter++;
		}
	}

}