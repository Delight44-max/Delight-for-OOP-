package models;

public class Doctor {
    private String doctorId;
    private String name;
    private String department;
    private String contactInfo;
    private boolean isAvailable;

    public Doctor(String doctorId, String name, String department, String contactInfo, boolean available) {
        this.doctorId = doctorId;
        this.name = name;
        this.department = department;
        this.contactInfo = contactInfo;
        this.isAvailable = available;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void updateAvailability(boolean status) {
        this.isAvailable = status;
    }

    public boolean isValidContactInfo() {
        return contactInfo != null && contactInfo.matches("^\\d{11}$");
    }
}
