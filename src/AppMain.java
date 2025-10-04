import models.Doctor;
import models.Patient;
import models.Appointment;
import Queue.QueueManager;

import java.time.LocalDateTime;
import java.util.*;

public class AppMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Doctor> doctors = new ArrayList<>();
    private static final List<Patient> patients = new ArrayList<>();
    private static final List<Appointment> appointments = new ArrayList<>();
    private static final QueueManager queueManager = new QueueManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- HealthLine Hospital Management ---");
            System.out.println("1. Register Doctor");
            System.out.println("2. Register Patient");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Queue");
            System.out.println("5. Call Next Patient");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> registerDoctor();
                case 2 -> registerPatient();
                case 3 -> scheduleAppointment();
                case 4 -> viewQueue();
                case 5 -> callNextPatient();
                case 6 -> {
                    System.out.println("Exiting system...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void registerDoctor() {
        System.out.print("Doctor ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Contact Info: ");
        String contact = scanner.nextLine();
        Doctor doc = new Doctor(id, name, dept, contact, true);
        doctors.add(doc);
        System.out.println("Doctor registered successfully.");
    }

    private static void registerPatient() {
        System.out.print("Patient ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Contact Info: ");
        String contact = scanner.nextLine();
        System.out.print("Reason for Visit: ");
        String reason = scanner.nextLine();
        Patient patient = new Patient(id, name, age, contact, reason);
        patients.add(patient);
        System.out.println("Patient registered successfully.");
    }

    private static void scheduleAppointment() {
        System.out.print("Appointment ID: ");
        String apptId = scanner.nextLine();
        System.out.print("Doctor ID: ");
        String docId = scanner.nextLine();
        System.out.print("Patient ID: ");
        String patId = scanner.nextLine();
        System.out.print("Date & Time (yyyy-MM-ddTHH:mm): ");
        String dateTimeStr = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);

        Appointment newAppt = new Appointment(apptId, docId, patId, dateTime, "Scheduled");

        for (Appointment appt : appointments) {
            if (appt.conflictsWith(newAppt)) {
                System.out.println("Conflict detected! Appointment not scheduled.");
                return;
            }
        }

        appointments.add(newAppt);
        queueManager.addToQueue(newAppt);
        System.out.println("Appointment scheduled and added to queue.");
    }

    private static void viewQueue() {
        System.out.println("Current Queue:");
        for (Appointment appt : appointments) {
            System.out.println(appt.getAppointmentId() + " - " + appt.getPatientId() + " - " + appt.getStatus());
        }
    }

    private static void callNextPatient() {
        Appointment next = queueManager.callNext();
        if (next != null) {
            System.out.println("Calling patient: " + next.getPatientId() + " for appointment " + next.getAppointmentId());
            queueManager.markStatus(next.getAppointmentId(), "Seen");
        } else {
            System.out.println("No patients in queue.");
        }
    }
}
