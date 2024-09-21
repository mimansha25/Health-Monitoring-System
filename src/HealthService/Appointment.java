package HealthService;
import java.time.LocalDate;

public class Appointment {
	 // Private fields for appointment details
		private int appointmentId;
	    private int patientId;
	    private int doctorId;
	    private LocalDate appointmentDate;
	    private String status;

	    // Constructor to initialize appointment details
	    public Appointment(int appointmentId, int patientId, int doctorId, LocalDate appointmentDate, String status) {
	        this.appointmentId = appointmentId;
	        this.patientId = patientId;
	        this.doctorId = doctorId;
	        this.appointmentDate = appointmentDate;
	        this.status = status;
	    }

	    // Getters for accessing private fields
	    public int getAppointmentId() { return appointmentId; }
	    public int getPatientId() { return patientId; }
	    public int getDoctorId() { return doctorId; }
	    public LocalDate getAppointmentDate() { return appointmentDate; }
	    public String getStatus() { return status; }
	    
	    // Setter for updating the appointment status
	    public void setStatus(String status) { this.status = status; }

	    // Override the toString() method to provide a string representation of the appointment object
	    @Override
	    public String toString() {
	        return "Appointment{" +
	                "appointmentId=" + appointmentId +
	                ", patientId=" + patientId +
	                ", doctorId=" + doctorId +
	                ", appointmentDate=" + appointmentDate +
	                ", status='" + status + '\'' +
	                '}';
	    }
}
