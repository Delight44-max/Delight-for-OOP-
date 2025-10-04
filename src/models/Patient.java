package models;

public class Patient {
private String patientId;
private String name;
private int age;
private String contactInfo;
private String reasonForVisit;

public Patient(String patientId, String name, int age, String contactInfo, String reasonForVisit) {
    this.patientId = patientId;
    this.name = name;
    this.age = age;
    this.contactInfo = contactInfo;
    this.reasonForVisit = reasonForVisit;
}

public String getPatientId() {
    return patientId;
}

public String getName() {
        return name;
    }
public int getAge() {
    return age;
}

public String getContactInfo() {
    return contactInfo;
}
public String getReasonForVisit() {
    return reasonForVisit;
}


    public boolean isValidContactInfo() {
    return  contactInfo != null && contactInfo.matches("^\\d{11}$");
    }

    public void setReasonForVisit(String reasonForVisit) {
    this.reasonForVisit = "Chest Pain";

    }
}
