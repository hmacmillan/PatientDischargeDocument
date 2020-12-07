package uk.nhs.scot.tayside.view;

import uk.nhs.scot.tayside.control.Navigation;
import uk.nhs.scot.tayside.domain.entity.DischargeFormEntry;
import uk.nhs.scot.tayside.dto.DischargeSummary;
import uk.nhs.scot.tayside.service.FormUpdateService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDateTime;

@Named
@ViewScoped
public class DischargeFormView implements Serializable {



//    @Inject
//    private DataPersistanceTest dataPersistanceTest;


    @Inject
    private FormUpdateService formUpdateService;

    @Inject
    private Navigation navigation;

    private DischargeFormEntry dischargeFormEntry;


    @PostConstruct
    public void init() {
//        DischargeSummary activeDischargeSummary = dischargeFormSession.getActiveDischargeSummary();
//
//        dischargeFormEntry = new DischargeFormEntry();
//
//        dischargeFormEntry.setAdmissionID(activeDischargeSummary.getAdmissionID());
//        dischargeFormEntry.setAdmissionLocation(activeDischargeSummary.getAdmissionLocation());
//        dischargeFormEntry.setAdmissionSpecialty(activeDischargeSummary.getAdmissionSpecialty());
//        dischargeFormEntry.setAdmissionWard(activeDischargeSummary.getAdmissionWard());
//        dischargeFormEntry.setLatestConsultant(activeDischargeSummary.getLatestConsultant());

    }


    public void setUpForm(DischargeSummary activeDischargeSummary) {
        // DischargeSummary activeDischargeSummary = dischargeFormSession.getActiveDischargeSummary();

        dischargeFormEntry = new DischargeFormEntry();

        DischargeFormEntry latestFormforAdmission = formUpdateService.getLatestFormforAdmission(activeDischargeSummary);

        if (latestFormforAdmission != null) {


            dischargeFormEntry.setDiagnosis(latestFormforAdmission.getDiagnosis());
            dischargeFormEntry.setForm_version(latestFormforAdmission.getForm_version());
        }



        dischargeFormEntry.setAdmissionID(activeDischargeSummary.getAdmissionID());
        dischargeFormEntry.setAdmissionLocation(activeDischargeSummary.getAdmissionLocation());
        dischargeFormEntry.setAdmissionSpecialty(activeDischargeSummary.getAdmissionSpecialty());
        dischargeFormEntry.setAdmissionWard(activeDischargeSummary.getAdmissionWard());
        dischargeFormEntry.setLatestConsultant(activeDischargeSummary.getLatestConsultant());
        dischargeFormEntry.setForm_version(dischargeFormEntry.getForm_version() + 1);


    }


    public void saveForm() {
        dischargeFormEntry.setLast_edited_on(LocalDateTime.now());

        formUpdateService.saveDischargeFormEntrytoDatabase(dischargeFormEntry);
        navigation.updateCurrentPage("DischargeSummary.xhtml");

    }


    public DischargeFormEntry getDischargeFormEntry() {
        return dischargeFormEntry;
    }

    public void setDischargeFormEntry(DischargeFormEntry dischargeFormEntry) {
        this.dischargeFormEntry = dischargeFormEntry;
    }
}
