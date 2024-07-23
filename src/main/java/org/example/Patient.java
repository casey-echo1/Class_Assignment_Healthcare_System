package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	private int patientID;
	private String name;
	List<MedicalRecord> MedicalHistory = new ArrayList<MedicalRecord>();

	//constructor
	public void Patient(int patientID, String name, List<MedicalRecord> MedicalHistory) {
		this.patientID = patientID;
		this.name = name;
		this.MedicalHistory = MedicalHistory;
	}


	//getters
	public int getPatientID() {
		return patientID;
	}
	public String getPatientName() {
		return name;
	}
	public List<MedicalRecord> getMedicalHistory() {
		return MedicalHistory;
	}

	//setters
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public void setPatientName(String name) {
		this.name = name;
	}
	public void setMedicalHistory(List<MedicalRecord> MedicalHistory) {
		this.MedicalHistory = MedicalHistory;
	}

	//methods
	public void addMedicalRecord(MedicalRecord record) {
		MedicalHistory.add(record);
	}
	public void updateMedicalRecord(int index, MedicalRecord newRecord){
		MedicalHistory.set(index, newRecord);
	}
	public MedicalRecord getMedicalRecord(int index){
		return MedicalHistory.get(index);
	}

	@Override
	public String toString() {
		return "Patient{" +
			"patientID=" + patientID +
			", name='" + name + '\'' +
			", MedicalHistory=" + MedicalHistory +
			'}';
	}
}
