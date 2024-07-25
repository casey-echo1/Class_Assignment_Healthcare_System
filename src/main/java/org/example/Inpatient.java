//good
package org.example;

public class Inpatient extends Patient{
	//additional attributes
	private String admissionDate;
	private	String roomNumber;

	//constructor

	public Inpatient(int patientID, String patientName, String admissionDate, String roomNumber) {
		super.setPatientID(patientID);
		super.setPatientName(patientName);
		this.roomNumber = roomNumber;
		this.admissionDate = admissionDate;
	}



	//getters / setters

	public String getAdmissionDate() {
		return admissionDate;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

//override toString()

	@Override
	public String toString() {
		return "Inpatient{" +
			"PatientID=" + super.getPatientID() +
			", PatientName='" + super.getPatientName() + '\'' +
			"admissionDate='" + admissionDate + '\'' +
			", roomNumber='" + roomNumber + '\'' +
			'}';
	}
}
