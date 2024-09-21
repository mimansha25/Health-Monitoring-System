package HealthService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        HealthMonitoringSystem hms = new HealthMonitoringSystem();
        try {
            hms.loadData();
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return;
        }

        // Register a new patient
        Patient newPatient = new Patient(11, "Mimansha", 23, "Female", List.of("BP"));
        hms.registerNewPatient(newPatient);

        System.out.println("---------------------");
        // Schedule an appointment
        hms.scheduleAppointment(3, 1, LocalDate.of(2024, 9, 22));

        System.out.println("---------------------");
        // Update patient vitals
        hms.updatePatientVitals(1, "High Cholesterol");

        System.out.println("---------------------");
        // Retrieve sorted patient data
        hms.retrieveSortedPatientData();

        System.out.println("---------------------");
        // Manage doctor's appointments
        hms.manageDoctorAppointments(1);

        System.out.println("---------------------");
        // Retrieve medical history
        hms.retrieveMedicalHistory(2);
    }
}
