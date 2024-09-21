Health Monitoring System
Overview
The Health Monitoring System (HMS) is a Java application that manages patient data, schedules appointments, updates patient vitals, and retrieves medical histories. It demonstrates key Object-Oriented Programming (OOP) concepts such as classes, inheritance, and polymorphism.
---------------------------------------------------------------------
Project Structure:
HealthMonitoringSystem/
│
├── src/
│   └── HealthService/
│       ├── Patient.java
│       ├── Doctor.java
│       ├── Appointment.java
│       ├── FileManager.java
│       ├── PatientSorter.java
│       ├── HealthMonitoringSystem.java
│       └── Main.java
│
├── data/
    ├── Patients.csv
    ├── Doctors.csv
    └── Appointments.csv
---------------------------------------------------------------------------------------------------------------------------------
Prerequisites:
Java 8 or above installed on your system.
How to Run
  1.Compile the Source Code:
    *Navigate to the src directory:
      cd src
    *Compile all Java files:
      javac HealthService/*.java
  2.Run the Program:
    Execute the Main class:
      java HealthService.Main
--------------------------------------------------------------------------------------------------------------------------------------
Assumptions:
CSV files (Patients.csv, Doctors.csv, Appointments.csv) are located in the data/ directory.
Data formats in CSV files should match the expected structure (IDs are unique, dates are in YYYY-MM-DD format).


-------------------------------------------------------------------------------------------------------------------------------------------


For questions or issues, please contact mimansha.sit.comp@gmail.com.
