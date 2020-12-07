package uk.nhs.scot.tayside.service;

import uk.nhs.scot.tayside.dto.AdmissionSummaryEntry;
import uk.nhs.scot.tayside.dto.DischargeSummary;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class DischargeSummaryService implements Serializable {

    @Inject
    private TrakdataService trakdataService;


    public List<DischargeSummary> getDischargeSummariesforPatient(String chinumber) throws IOException {

        List<AdmissionSummaryEntry> admissionsForPatient = trakdataService.getAdmissionsForPatient(chinumber);

        List<DischargeSummary> dischargeSummaryList = new ArrayList<>();

        for (AdmissionSummaryEntry admissionSummaryEntry : admissionsForPatient) {

            DischargeSummary dischargeSummary = new DischargeSummary();

            dischargeSummary.setAdmissionID(admissionSummaryEntry.getAdmissionId());

            dischargeSummary.setAdmissionDateTime(admissionSummaryEntry.getAdmissionDateTime());

            dischargeSummary.setAdmissionSpecialty(admissionSummaryEntry.getCurrentSpecialty());
            dischargeSummary.setAdmissionWard(admissionSummaryEntry.getCurrentWardLocation());
            dischargeSummary.setAdmissionLocation(admissionSummaryEntry.getCurrentHospitalLocation());

            dischargeSummary.setLatestConsultant(getConsultantFullName(admissionSummaryEntry));

            dischargeSummaryList.add(dischargeSummary);

        }


        return dischargeSummaryList;

    }


    private String getConsultantFullName(AdmissionSummaryEntry admissionSummaryEntry) {
        String fullname = "";

        if (admissionSummaryEntry.getCurrentConsultantTitle() != null && !admissionSummaryEntry.getCurrentConsultantTitle().isEmpty()) {
            fullname = fullname + admissionSummaryEntry.getCurrentConsultantTitle() + " ";
        }

        if (admissionSummaryEntry.getCurrentConsultantFirstName() != null && !admissionSummaryEntry.getCurrentConsultantFirstName().isEmpty()) {
            fullname = fullname + admissionSummaryEntry.getCurrentConsultantFirstName() + " ";
        }

        if (admissionSummaryEntry.getCurrentConsultantSurname() != null && !admissionSummaryEntry.getCurrentConsultantSurname().isEmpty()) {
            fullname = fullname + admissionSummaryEntry.getCurrentConsultantSurname() + " ";
        }

        if (admissionSummaryEntry.getCurrentConsultantGMCNumber() != null && !admissionSummaryEntry.getCurrentConsultantGMCNumber().isEmpty()) {
            fullname = fullname + " (" + admissionSummaryEntry.getCurrentConsultantGMCNumber() + ")";
        }


        return fullname;
    }

}

