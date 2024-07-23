package org.example;

public class Outpatient extends Patient{
	String appointmentDate, doctorName;

	public Outpatient(int patientID, String patientName, String appointmentDate, String doctorName) {
		super.setPatientID(patientID);
		super.setPatientName(patientName);
		this.appointmentDate = appointmentDate;
		this.doctorName = doctorName;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Outpatient{" +
			"PatientID=" + super.getPatientID() +
			"PatientName=" + super.getPatientName() +
			"appointmentDate='" + appointmentDate + '\'' +
			", doctorName='" + doctorName + '\'' +
			'}';
	}
}
