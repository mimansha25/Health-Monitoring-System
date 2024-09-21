package HealthService;

import java.util.List;

public class PatientSorter {
	
	 // Method to sort a list of patients by age using the bubble sort algorithm
	 public static void bubbleSortByAge(List<Patient> patients) {
	        int n = patients.size();
	        
	     // Outer loop to traverse through the list
	        for (int i = 0; i < n - 1; i++) {
	        	// Inner loop to compare adjacent elements
	            for (int j = 0; j < n - i - 1; j++) {
	            	 // Compare age of current patient with the next patient
	                if (patients.get(j).getAge() > patients.get(j + 1).getAge()) {
	                	 // Swap patients if they are in the wrong order
	                    Patient temp = patients.get(j);
	                    patients.set(j, patients.get(j + 1));
	                    patients.set(j + 1, temp);
	                }
	            }
	        }
	    }
}
