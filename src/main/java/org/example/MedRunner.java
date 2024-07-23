package org.example;

import java.util.ArrayList;
import java.util.List;

public class MedRunner {
	public static void main(String[] args) {
		//Patient, Inpatient, Outpatient, MedicalRecord, Hospital
		Patient p1 = new Patient();
		Patient p2 = new Patient();
		Patient p3 = new Patient();
		//set names and ids
		p1.setPatientID(54);
		p1.setPatientName("Tom");
		p2.setPatientID(45);
		p2.setPatientName("John");
		p3.setPatientID(38);
		p3.setPatientName("Suzan");

		Inpatient inpatient1 = new Inpatient(p1.getPatientID(), p1.getPatientName(), "07/23/2024", "1");
		Inpatient inpatient2 = new Inpatient(p2.getPatientID(), p2.getPatientName(), "06/03/2024", "4");
		Inpatient inpatient3 = new Inpatient(p3.getPatientID(), p3.getPatientName(), "07/12/2024", "11");
		Outpatient outpatient1 = new Outpatient(p1.getPatientID(), p1.getPatientName(), "07/26/2024", "Matt");
		Outpatient outpatient2 = new Outpatient(p2.getPatientID(), p2.getPatientName(), "07/29/2024", "Matt");
		MedicalRecord mr1 = new MedicalRecord("07/23/2024","This patient is allergic to MG200");
		MedicalRecord mr2 = new MedicalRecord("05/01/2024","This patient is 600 pounds");

		p1.addMedicalRecord(mr1);
		p2.addMedicalRecord(mr2);
		System.out.println("Patient 1: " + p1.toString());
		System.out.println("Inpatient 1: " + inpatient1.toString());

		Hospital <Patient> hospital2 = new Hospital();


		hospital2.addPatient(p1);
		hospital2.addPatient(p2);
		System.out.println(hospital2.toString());
//=> Ask if there is a way to return the patient knowing his/her ID
		System.out.println("Patient 45: " + hospital2.getPatient(45));

	}
}

