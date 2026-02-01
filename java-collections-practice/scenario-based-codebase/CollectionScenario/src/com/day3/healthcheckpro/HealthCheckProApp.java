package com.day3.healthcheckpro;

import com.day3.healthcheckpro.controller.PatientController;
import com.day3.healthcheckpro.controller.LabReportController;

public class HealthCheckProApp {
	public static void main(String[] args) {
		HealthCheckPro checker = new HealthCheckPro();

		checker.scanController(PatientController.class);
		checker.scanController(LabReportController.class);

		checker.printWarnings();
		checker.printDocumentation();
	}
}