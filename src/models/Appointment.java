package models;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private String doctorId;
    private String patientId;
    private LocalDateTime dateTime;
    private String status;

    public Appointment(String appointmentId, String doctorId, String patientId, LocalDateTime dateTime, String status) {
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.dateTime = dateTime;
        this.status = status;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public boolean conflictsWith(Appointment other) {
        return this.doctorId.equals(other.doctorId) && this.dateTime.equals(other.dateTime);
    }
}

