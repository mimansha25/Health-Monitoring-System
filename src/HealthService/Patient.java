package HealthService;
import java.util.List;

public class Patient {
		// Private fields for patient details
		private int id;
	    private String name;
	    private int age;
	    private String gender;
	    private List<String> medicalHistory;

	    // Constructor to initialize patient details
	    public Patient(int id, String name, int age, String gender, List<String> medicalHistory) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.medicalHistory = medicalHistory;
	    }

	    // Getters for accessing private fields
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public String getGender() { return gender; }
	    public List<String> getMedicalHistory() { return medicalHistory; }

	 // Method to add a new medical condition to the history
	    public void addMedicalCondition(String condition) {
	        this.medicalHistory.add(condition);
	    }

	 // Override the toString() method to provide a string representation of the patient object
	    @Override
	    public String toString() {
	        return "Patient{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", gender='" + gender + '\'' +
	                ", medicalHistory=" + medicalHistory +
	                '}';
	    }
}
