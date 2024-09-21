package HealthService;

public class Doctor {
	// Private fields for doctor details
		private int doctorId;
	    private String name;
	    private String specialization;

	 // Constructor to initialize doctor details
	    public Doctor(int doctorId, String name, String specialization) {
	        this.doctorId = doctorId;
	        this.name = name;
	        this.specialization = specialization;
	    }

	 // Getters for accessing private fields
	    public int getDoctorId() { return doctorId; }
	    public String getName() { return name; }
	    public String getSpecialization() { return specialization; }

	    // Override the toString() method to provide a string representation of the doctor object
	    @Override
	    public String toString() {
	        return "Doctor{" +
	                "doctorId=" + doctorId +
	                ", name='" + name + '\'' +
	                ", specialization='" + specialization + '\'' +
	                '}';
	    }
}
