package HealthService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HealthMonitoringSystem {
	 // Lists to store patients, doctors, and appointments
		private List<Patient> patients;
	    private List<Doctor> doctors;
	    private List<Appointment> appointments;

	 // Load data from files into the system
	    public void loadData() throws IOException {
	    	FileManager fileManager = new FileManager(); 

	       
	        patients = fileManager.readPatientsFromFile("data/Patients.csv");
	        doctors = fileManager.readDoctorsFromFile("data/Doctors.csv");
	        appointments = fileManager.readAppointmentsFromFile("data/Appointments.csv");
	    }

	    // Use Case 1: Register New Patient
	    public void registerNewPatient(Patient newPatient) {
	        patients.add(newPatient);
	        System.out.println("Patient Registered: " + newPatient);
	    }

	    // Use Case 2: Schedule Appointment
	    public void scheduleAppointment(int patientId, int doctorId, LocalDate appointmentDate) {
	        int newAppointmentId = appointments.size() + 1;
	        Appointment appointment = new Appointment(newAppointmentId,patientId,doctorId,appointmentDate,"Booked");
	        appointments.add(appointment);
	        System.out.println("Appointment Scheduled: " + appointment);
	    }

	    // Use Case 3: Update Patient Vitals
	    public void updatePatientVitals(int patientId, String condition) {
	        for (Patient patient : patients) {
	            if (patient.getId() == patientId) {
	                patient.addMedicalCondition(condition);
	                System.out.println("Vitals Updated: " + patient);
	                return;
	            }
	        }
	        System.out.println("Patient not found!");
	    }

	    // Use Case 4: Retrieve Sorted Patient Data
	    public void retrieveSortedPatientData() {
	        PatientSorter.bubbleSortByAge(patients);
	        for (Patient patient : patients) {
	            System.out.println(patient);
	        }
	    }

	    // Use Case 5: Manage Doctor’s Appointments
	    public void manageDoctorAppointments(int doctorId) {
	        for (Appointment appointment : appointments) {
	            if (appointment.getDoctorId() == doctorId) {
	                System.out.println(appointment);
	            }
	        }
	    }

	    // Use Case 6: Retrieve Medical History
	    public void retrieveMedicalHistory(int patientId) {
	        for (Patient patient : patients) {
	            if (patient.getId() == patientId) {
	                System.out.println("Medical History for Patient " + patientId + ": " + patient.getMedicalHistory());
	                return;
	            }
	        }
	        System.out.println("Patient not found!");
	    }
}
