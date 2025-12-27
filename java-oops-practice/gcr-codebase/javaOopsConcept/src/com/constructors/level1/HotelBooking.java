package com.constructors.level1;

public class HotelBooking {
	
	// Attributes
    String guestName;
    String roomType;
    int nights;

    //Default constructor
    public HotelBooking() {
        guestName = "Unknown Guest";
        roomType = "Standard";
        nights = 1;
    }

    //Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Default booking
        HotelBooking booking1 = new HotelBooking();

        // Parameterized booking
        HotelBooking booking2 = new HotelBooking("Krishna", "Deluxe", 3);

        // Copy booking
        HotelBooking booking3 = new HotelBooking(booking2);

        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();

	}

}
