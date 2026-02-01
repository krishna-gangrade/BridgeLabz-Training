package com.day3.healthcheckpro.controller;

import com.day3.healthcheckpro.annotation.PublicAPI;
import com.day3.healthcheckpro.annotation.RequiresAuth;

public class PatientController {

    @PublicAPI(description = "Get available lab tests")
    public void getLabTests() {
        System.out.println("Lab tests returned.");
    }

    @RequiresAuth(role = "PATIENT", description = "Book lab slot")
    public void bookLabTest() {
    	System.out.println("Lab tests booked.");
    }

    // missing annotation
    public void cancelAppointment() {
    	System.out.println("Appointment cancelled.");
    }

    @RequiresAuth(role = "DOCTOR", description = "View lab results")
    public void viewResults() {
    	System.out.println("Results display complete.");
    }
}
