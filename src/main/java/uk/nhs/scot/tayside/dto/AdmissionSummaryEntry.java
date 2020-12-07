package uk.nhs.scot.tayside.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import uk.nhs.scot.tayside.utilities.LocalDateTimeDeserializer;
import uk.nhs.scot.tayside.utilities.LocalDateTimeSerializer;

import java.time.LocalDateTime;

public class AdmissionSummaryEntry implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    String admissionId;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDateTime admissionDateTime;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDateTime actualDischargeDateTime;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    LocalDateTime estimatedDischargeDateTime;

    String currentHospitalLocationCode;
    String currentHospitalLocation;
    String currentWardLocationCode;
    String currentWardLocation;
    String currentSpecialty;
    String currentSpecialtyCode;
    String currentConsultantTitle;
    String currentConsultantFirstName;
    String currentConsultantSurname;
    String currentConsultantGMCNumber;

    String admissionHospitalLocationCode;
    String admissionHospitalLocation;
    String admissionWardLocationCode;
    String admissionWardLocation;
    String admissionSpecialty;
    String admissionSpecialtyCode;
    String admissionConsultantTitle;
    String admissionConsultantFirstName;
    String admissionConsultantSurname;
    String admissionConsultantGMCNumber;

    public String getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId;
    }

    public LocalDateTime getAdmissionDateTime() {
        return admissionDateTime;
    }

    public void setAdmissionDateTime(LocalDateTime admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    public String getCurrentHospitalLocationCode() {
        return currentHospitalLocationCode;
    }

    public void setCurrentHospitalLocationCode(String currentHospitalLocationCode) {
        this.currentHospitalLocationCode = currentHospitalLocationCode;
    }

    public String getCurrentHospitalLocation() {
        return currentHospitalLocation;
    }

    public void setCurrentHospitalLocation(String currentHospitalLocation) {
        this.currentHospitalLocation = currentHospitalLocation;
    }

    public String getCurrentWardLocationCode() {
        return currentWardLocationCode;
    }

    public void setCurrentWardLocationCode(String currentWardLocationCode) {
        this.currentWardLocationCode = currentWardLocationCode;
    }

    public String getCurrentWardLocation() {
        return currentWardLocation;
    }

    public void setCurrentWardLocation(String currentWardLocation) {
        this.currentWardLocation = currentWardLocation;
    }

    public String getCurrentSpecialty() {
        return currentSpecialty;
    }

    public void setCurrentSpecialty(String currentSpecialty) {
        this.currentSpecialty = currentSpecialty;
    }

    public String getCurrentSpecialtyCode() {
        return currentSpecialtyCode;
    }

    public void setCurrentSpecialtyCode(String currentSpecialtyCode) {
        this.currentSpecialtyCode = currentSpecialtyCode;
    }

    public LocalDateTime getActualDischargeDateTime() {
        return actualDischargeDateTime;
    }

    public void setActualDischargeDateTime(LocalDateTime actualDischargeDateTime) {
        this.actualDischargeDateTime = actualDischargeDateTime;
    }

    public LocalDateTime getEstimatedDischargeDateTime() {
        return estimatedDischargeDateTime;
    }

    public void setEstimatedDischargeDateTime(LocalDateTime estimatedDischargeDateTime) {
        this.estimatedDischargeDateTime = estimatedDischargeDateTime;
    }

    public String getAdmissionHospitalLocationCode() {
        return admissionHospitalLocationCode;
    }

    public void setAdmissionHospitalLocationCode(String admissionHospitalLocationCode) {
        this.admissionHospitalLocationCode = admissionHospitalLocationCode;
    }

    public String getAdmissionHospitalLocation() {
        return admissionHospitalLocation;
    }

    public void setAdmissionHospitalLocation(String admissionHospitalLocation) {
        this.admissionHospitalLocation = admissionHospitalLocation;
    }

    public String getAdmissionWardLocationCode() {
        return admissionWardLocationCode;
    }

    public void setAdmissionWardLocationCode(String admissionWardLocationCode) {
        this.admissionWardLocationCode = admissionWardLocationCode;
    }

    public String getAdmissionWardLocation() {
        return admissionWardLocation;
    }

    public void setAdmissionWardLocation(String admissionWardLocation) {
        this.admissionWardLocation = admissionWardLocation;
    }

    public String getAdmissionSpecialty() {
        return admissionSpecialty;
    }

    public void setAdmissionSpecialty(String admissionSpecialty) {
        this.admissionSpecialty = admissionSpecialty;
    }

    public String getAdmissionSpecialtyCode() {
        return admissionSpecialtyCode;
    }

    public void setAdmissionSpecialtyCode(String admissionSpecialtyCode) {
        this.admissionSpecialtyCode = admissionSpecialtyCode;
    }

    public String getCurrentConsultantTitle() {
        return currentConsultantTitle;
    }

    public void setCurrentConsultantTitle(String currentConsultantTitle) {
        this.currentConsultantTitle = currentConsultantTitle;
    }

    public String getCurrentConsultantFirstName() {
        return currentConsultantFirstName;
    }

    public void setCurrentConsultantFirstName(String currentConsultantFirstName) {
        this.currentConsultantFirstName = currentConsultantFirstName;
    }

    public String getCurrentConsultantSurname() {
        return currentConsultantSurname;
    }

    public void setCurrentConsultantSurname(String currentConsultantSurname) {
        this.currentConsultantSurname = currentConsultantSurname;
    }

    public String getCurrentConsultantGMCNumber() {
        return currentConsultantGMCNumber;
    }

    public void setCurrentConsultantGMCNumber(String currentConsultantGMCNumber) {
        this.currentConsultantGMCNumber = currentConsultantGMCNumber;
    }

    public String getAdmissionConsultantTitle() {
        return admissionConsultantTitle;
    }

    public void setAdmissionConsultantTitle(String admissionConsultantTitle) {
        this.admissionConsultantTitle = admissionConsultantTitle;
    }

    public String getAdmissionConsultantFirstName() {
        return admissionConsultantFirstName;
    }

    public void setAdmissionConsultantFirstName(String admissionConsultantFirstName) {
        this.admissionConsultantFirstName = admissionConsultantFirstName;
    }

    public String getAdmissionConsultantSurname() {
        return admissionConsultantSurname;
    }

    public void setAdmissionConsultantSurname(String admissionConsultantSurname) {
        this.admissionConsultantSurname = admissionConsultantSurname;
    }

    public String getAdmissionConsultantGMCNumber() {
        return admissionConsultantGMCNumber;
    }

    public void setAdmissionConsultantGMCNumber(String admissionConsultantGMCNumber) {
        this.admissionConsultantGMCNumber = admissionConsultantGMCNumber;
    }


    @Override
    public String toString() {
        return "AdmissionSummaryEntry{" +
                "admissionId='" + admissionId + '\'' +
                ", admissionDateTime=" + admissionDateTime +
                ", actualDischargeDateTime=" + actualDischargeDateTime +
                ", estimatedDischargeDateTime=" + estimatedDischargeDateTime +
                ", currentHospitalLocationCode='" + currentHospitalLocationCode + '\'' +
                ", currentHospitalLocation='" + currentHospitalLocation + '\'' +
                ", currentWardLocationCode='" + currentWardLocationCode + '\'' +
                ", currentWardLocation='" + currentWardLocation + '\'' +
                ", currentSpecialty='" + currentSpecialty + '\'' +
                ", currentSpecialtyCode='" + currentSpecialtyCode + '\'' +
                ", currentConsultantTitle='" + currentConsultantTitle + '\'' +
                ", currentConsultantFirstName='" + currentConsultantFirstName + '\'' +
                ", currentConsultantSurname='" + currentConsultantSurname + '\'' +
                ", currentConsultantGMCNumber='" + currentConsultantGMCNumber + '\'' +
                ", admissionHospitalLocationCode='" + admissionHospitalLocationCode + '\'' +
                ", admissionHospitalLocation='" + admissionHospitalLocation + '\'' +
                ", admissionWardLocationCode='" + admissionWardLocationCode + '\'' +
                ", admissionWardLocation='" + admissionWardLocation + '\'' +
                ", admissionSpecialty='" + admissionSpecialty + '\'' +
                ", admissionSpecialtyCode='" + admissionSpecialtyCode + '\'' +
                ", admissionConsultantTitle='" + admissionConsultantTitle + '\'' +
                ", admissionConsultantFirstName='" + admissionConsultantFirstName + '\'' +
                ", admissionConsultantSurname='" + admissionConsultantSurname + '\'' +
                ", admissionConsultantGMCNumber='" + admissionConsultantGMCNumber + '\'' +
                '}';
    }
}
