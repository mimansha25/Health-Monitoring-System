package HealthService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class FileManager {
	
	 // Method to read patient data from a file and create a list of Patient objects
    public static List<Patient> readPatientsFromFile(String filename) throws IOException {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); 
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                String gender = data[3].trim();
                String[] historyArray = data[4].replaceAll("[\\[\\]\"]", "").split(",");
                List<String> medicalHistory = new ArrayList<>();
                for (String condition : historyArray) {
                    medicalHistory.add(condition.trim());
                }
                patients.add(new Patient(id, name, age, gender, medicalHistory));
            }
        }
        return patients;
    }

    // Method to read doctor data from a file and create a list of Doctor objects
    public static List<Doctor> readDoctorsFromFile(String filename) throws IOException {
        List<Doctor> doctors = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String specialization = data[2].trim();
                doctors.add(new Doctor(id, name, specialization));
            }
        }
        return doctors;
    }

    // Method to read appointment data from a file and create a list of Appointment objects
    public static List<Appointment> readAppointmentsFromFile(String filename) throws IOException {
        List<Appointment> appointments = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int appointmentId = Integer.parseInt(data[0].trim());
                int patientId = Integer.parseInt(data[1].trim());
                int doctorId = Integer.parseInt(data[2].trim());
                LocalDate appointmentDate = LocalDate.parse(data[3].trim());
                String status = data[4].trim();
                appointments.add(new Appointment(appointmentId, patientId, doctorId, appointmentDate, status));
            }
        }
        return appointments;
    }
}
