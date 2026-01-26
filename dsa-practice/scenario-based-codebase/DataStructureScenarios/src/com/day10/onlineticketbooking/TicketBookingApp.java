
/*
2. AVL Tree
Story: Online Ticket Booking by Time
	Users book event tickets sorted by event time.
Scenarios:
	● 🔹 Scenario 1: Insert Event — Add new event based on start time.
	● 🔹 Scenario 2: Cancel Event — Admin deletes a cancelled event.
	● 🔹 Scenario 3: Show Events in Order — Display events in upcoming order.
*/

package com.day10.onlineticketbooking;

public class TicketBookingApp {
    public static void main(String[] args) {
        EventAVLTree bookingSystem = new EventAVLTree();

        System.out.println("===========================================================================================");
        System.out.println("                    ONLINE EVENT TICKET BOOKING SYSTEM (AVL)");
        System.out.println("===========================================================================================");

        // Scenario 1: Add new events
        bookingSystem.addEvent(new Event("EVT-20260310-101", "Startup Expo India",     "2026-03-15 10:00", "Delhi Expo Center",     3000));
        bookingSystem.addEvent(new Event("EVT-20260318-102", "AI Conference",  "2026-04-08 09:30", "Bengaluru Park",   1200));
        bookingSystem.addEvent(new Event("EVT-20260305-103", "Indie Music Fest",       "2026-03-22 18:30", "Pune Open Grounds",      900));
        bookingSystem.addEvent(new Event("EVT-20260325-104", "Cultural Dance Gala",   "2026-04-18 17:00", "Chennai Grounds",   2000));
        bookingSystem.addEvent(new Event("EVT-20260312-105", "Motivational Show","2026-03-28 16:00", "Hyderabad Park",   700));

        System.out.println("All upcoming events (chronological order):");
        bookingSystem.showUpcomingEvents();

        // Scenario 2: Cancel an event
        System.out.println("\nCancelling event EVT-20260120-003 (Comedy Night cancelled)");
        bookingSystem.cancelEvent("EVT-20260120-003");

        System.out.println("\nUpdated upcoming events:");
        bookingSystem.showUpcomingEvents();

        System.out.println("\nTotal active events: " + bookingSystem.getEventCount());
        System.out.println("===========================================================================================");
    }
}
