package com.day4.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,
                          int attendees, User organizer,
                          double venueCost, double serviceCost) {

        super(name, location, date, attendees, organizer,
              venueCost, serviceCost, 500); // birthday discount
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday Event Scheduled!");
        showDetails();
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled ❌");
    }
}