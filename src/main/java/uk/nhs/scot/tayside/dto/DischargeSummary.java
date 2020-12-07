package uk.nhs.scot.tayside.dto;

import uk.nhs.scot.tayside.enumerator.DocStatus;

import java.time.LocalDateTime;

public class DischargeSummary {

    private LocalDateTime admissionDateTime;
    private LocalDateTime estimatedDischargeDateTime;

    private String admissionSpecialty;
    private String admissionWard;
    private String admissionLocation;
    private String latestConsultant;
    private String diagnosis;
    private String admissionID;

    private DocStatus docStatus;


    public String getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(String admissionID) {
        this.admissionID = admissionID;
    }

    public LocalDateTime getAdmissionDateTime() {
        return admissionDateTime;
    }

    public void setAdmissionDateTime(LocalDateTime admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    public LocalDateTime getEstimatedDischargeDateTime() {
        return estimatedDischargeDateTime;
    }

    public void setEstimatedDischargeDateTime(LocalDateTime estimatedDischargeDateTime) {
        this.estimatedDischargeDateTime = estimatedDischargeDateTime;
    }

    public String getAdmissionSpecialty() {
        return admissionSpecialty;
    }

    public void setAdmissionSpecialty(String admissionSpecialty) {
        this.admissionSpecialty = admissionSpecialty;
    }

    public String getAdmissionWard() {
        return admissionWard;
    }

    public void setAdmissionWard(String admissionWard) {
        this.admissionWard = admissionWard;
    }

    public String getAdmissionLocation() {
        return admissionLocation;
    }

    public void setAdmissionLocation(String admissionLocation) {
        this.admissionLocation = admissionLocation;
    }

    public String getLatestConsultant() {
        return latestConsultant;
    }

    public void setLatestConsultant(String latestConsultant) {
        this.latestConsultant = latestConsultant;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public DocStatus getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(DocStatus docStatus) {
        this.docStatus = docStatus;
    }


    @Override
    public String toString() {
        return "DischargeSummary{" +
                "admissionDateTime=" + admissionDateTime +
                ", estimatedDischargeDateTime=" + estimatedDischargeDateTime +
                ", admissionSpecialty='" + admissionSpecialty + '\'' +
                ", admissionWard='" + admissionWard + '\'' +
                ", admissionLocation='" + admissionLocation + '\'' +
                ", latestConsultant='" + latestConsultant + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", admissionID='" + admissionID + '\'' +
                ", docStatus=" + docStatus +
                '}';
    }
}

