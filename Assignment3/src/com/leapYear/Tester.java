package com.leapYear;

class Tester {
    
	   public static int[] findLeapYears(int year){

	        int n = 15;
	        int count = 0;
	        int[] leapYears = new int [15];
	        
	        // while (count < n){
	        //      if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
	        //         leapYears[count] = year;
	        //         count += 1;
	                     
	        //     }
	        //     year += 1;
	        // }
	        
	        for (int i = 0, j = 0; i<leapYears.length; i++){
	             if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
	                leapYears[j] = year;
	                j++;
	                year += 1;
	                
	            } else {
	                i--;
	                year += 1;
	            }
	            
	        }
	  
	        return leapYears;
	   }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
	}
