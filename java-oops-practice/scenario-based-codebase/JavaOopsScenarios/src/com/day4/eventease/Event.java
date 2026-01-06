package com.day4.eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;          // cannot be modified
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    // pricing (encapsulated)
    private double venueCost;
    private double serviceCost;
    private double discount;

    private static int idCounter = 1000;

    // Constructor without catering/decoration
    Event(String eventName, String location, String date,
          int attendees, User organizer, double venueCost) {

        this(eventName, location, date, attendees, organizer, venueCost, 0, 0);
    }

    // Constructor with services
    Event(String eventName, String location, String date,
          int attendees, User organizer,
          double venueCost, double serviceCost, double discount) {

        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    protected void showDetails() {
        System.out.println("Event ID   : " + eventId);
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Attendees  : " + attendees);
        System.out.println("Organizer  : " + organizer.getName());
        System.out.println("Total Cost : ₹" + calculateTotalCost());
        System.out.println();
    }

    public abstract void schedule();
}