package com.infyTwo;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 120);

        //Create more objects and add them to the bookings array for testing your code
        
        Booking[] bookings = { booking1, booking2 };
              
        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }

	}

}
