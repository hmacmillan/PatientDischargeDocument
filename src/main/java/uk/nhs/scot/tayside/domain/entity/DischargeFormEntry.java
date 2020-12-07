package uk.nhs.scot.tayside.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "DemoDB.example.DISCHARGEFORMENTRY")
public class DischargeFormEntry {


    @Id
    @GeneratedValue
    private Long id; // unique id  of the parameter

    private String admissionSpecialty;
    private String admissionWard;
    private String admissionLocation;
    private String latestConsultant;
    private String diagnosis;
    private String admissionID;
    private int form_version;
    private LocalDateTime last_edited_on;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(String admissionID) {
        this.admissionID = admissionID;
    }

    public int getForm_version() {
        return form_version;
    }

    public void setForm_version(int form_version) {
        this.form_version = form_version;
    }

    public LocalDateTime getLast_edited_on() {
        return last_edited_on;
    }

    public void setLast_edited_on(LocalDateTime last_edited_on) {
        this.last_edited_on = last_edited_on;
    }


    @Override
    public String toString() {
        return "DischargeFormEntry{" +
                "id=" + id +
                ", admissionSpecialty='" + admissionSpecialty + '\'' +
                ", admissionWard='" + admissionWard + '\'' +
                ", admissionLocation='" + admissionLocation + '\'' +
                ", latestConsultant='" + latestConsultant + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", admissionID='" + admissionID + '\'' +
                ", form_version=" + form_version +
                ", last_edited_on=" + last_edited_on +
                '}';
    }
}
