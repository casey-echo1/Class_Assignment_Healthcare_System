package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hospital<T extends Patient> {
	List<T> patients = new ArrayList<>();

	//default constructor
	public Hospital() {}

	public Hospital(List<T> patients) {
		this.patients = patients;
	}

	public void addPatient(T patient){
		patients.add(patient);
	}
	public T getPatient(int patientID){
//		return patients.get(patientID);
		T toBeReturned =null;
		for (T patient : patients) {
			//i++, 0,1,2,3
			if (patientID == patient.getPatientID()) {
				toBeReturned = patient;
			}
		}
		return toBeReturned;
	}
}
