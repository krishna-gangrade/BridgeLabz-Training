package com.methodreferences.hospital;

import java.util.ArrayList;
import java.util.List;

public class PatientIdPrinterApp {
	public static void main(String[] args) {
		// sample patient list (as if from hospital database)
		List<Patient> patients = new ArrayList<>();
		patients.add(new Patient("P01", "Amit Kumar", 35));
		patients.add(new Patient("P02", "Ravi Sharma", 42));
		patients.add(new Patient("P03", "Sunita Devi", 29));
		patients.add(new Patient("P04", "Rajesh Singh", 50));
		patients.add(new Patient("P05", "Pooja Verma", 22));

		System.out.println("Hospital Admin - Patient ID Verification List");
		System.out.println("Printing all Patient IDs using Method Reference:");
		System.out.println("-----------------------------------------------");

		// Using method reference: Patient::getPatientId -> String reference
		// then System.out::println to print each ID
		patients.stream().map(Patient::getPatientId) // method reference to getter
				.forEach(System.out::println); // method reference to println

		System.out.println("-----------------------------------------------");
		System.out.println("Total patients verified: " + patients.size());
	}
}