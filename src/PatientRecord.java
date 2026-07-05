
import java.time.LocalDate;

// Author Christopher Britten
//SD15
/**
 This class represents a single patient history record.
 It stores the visit date, diagnosis, and treatment notes for one visit.
 Like Patient, this class has no navigation or list logic in it, it only
 holds data. PatientHistory stores objects of this class inside its nodes.
**/


public class PatientRecord {
    private LocalDate visitDate;
    private String diagnosis;
    private String treatmentNotes;

    public PatientRecord() {
    }

    public PatientRecord(LocalDate visitDate, String diagnosis, String treatmentNotes) {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentNotes() {
        return treatmentNotes;
    }

    public void setTreatmentNotes(String treatmentNotes) {
        this.treatmentNotes = treatmentNotes;
    }

    @Override
    public String toString() {
        return "PatientRecord - " +
                "Visit Date: " + visitDate +
                ", Diagnosis: " + diagnosis + '\'' +
                ", Treatment Notes: " + treatmentNotes + '\'';
    }
}
