
//Author: Christopher Britten
// DSA 2026

public class Patient {
    private int id;
    private String name;
    private String reasonForVisit;

    public Patient(int id, String name, String reasonForVisit) {
        this.id = id;
        this.name = name;
        this.reasonForVisit = reasonForVisit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    @Override
    public String toString() {
        return "Patient #" + id + " - " + name + " (" + reasonForVisit + ")";
    }
}