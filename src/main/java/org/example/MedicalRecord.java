package org.example;

public class MedicalRecord {
	private String date;
	private String description;

	public MedicalRecord(String date, String description) {
		this.date = date;
		this.description = description;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

//should we add patientID and patientName to toString()?
	@Override
	public String toString() {
		return "MedicalRecord{" +
			"date='" + date + '\'' +
			", description='" + description + '\'' +
			'}';
	}
}
