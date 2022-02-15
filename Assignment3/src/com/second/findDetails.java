package com.second;

class Tester {
    
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double total = 0;
          for(int i=0; i < salary.length; i++){
        	total = total + salary[i];
        }
        double average = total / salary.length;
        System.out.println("Average salary: " + average);
        
        double lowSalary = 0;
        double highSalary =0;
           for(int i=0; i < salary.length; i++){
               
        	if (salary[i] < average){
        	    lowSalary++;
        	System.out.println(lowSalary);
        	
        	}
        	if (salary[i] > average){
        	    highSalary++;
        	System.out.println(highSalary);

        	}
        }
        return null;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
        
        // System.out.println(average);
              
        // System.out.println("Average salary: "+ details[0]);
        // System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        // System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
