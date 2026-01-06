package com.day4.eventease;

public class EventEaseMain {

    public static void main(String[] args) {

        User organizer = new User(
                "Prashant Kumar Sharma",
                "Prashantkumar@gmail.com",
                "8252137016"
        );

        Event birthday = new BirthdayEvent(
                "Prashant Birthday",
                "Bhopal",
                "10-11-2026",
                50,
                organizer,
                15000,
                5000
        );

        Event conference = new ConferenceEvent(
                "Tech Conference",
                "Bangalore",
                "09-11-2026",
                300,
                organizer,
                50000,
                20000
        );

        birthday.schedule();
        conference.schedule();
    }
}