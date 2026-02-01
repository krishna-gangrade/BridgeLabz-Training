package com.day3.healthcheckpro.controller;

import com.day3.healthcheckpro.annotation.PublicAPI;
import com.day3.healthcheckpro.annotation.RequiresAuth;

public class LabReportController {

	@PublicAPI(description = "Check report status")
	public void checkStatus() {
		System.out.println("Status check complete.");
	}

	@RequiresAuth(role = "LAB_TECH", description = "Upload report")
	public void uploadReport() {
		System.out.println("Report upload complete.");
	}

	// missing annotation
	public void deleteOldReport() {
		System.out.println("Report deletion complete.");
	}
}
