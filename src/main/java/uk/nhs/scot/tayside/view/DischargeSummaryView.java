package uk.nhs.scot.tayside.view;

import uk.nhs.scot.tayside.control.Navigation;
import uk.nhs.scot.tayside.domain.dataaccess.DataPersistance;
import uk.nhs.scot.tayside.domain.entity.Patient;
import uk.nhs.scot.tayside.dto.DischargeSummary;
import uk.nhs.scot.tayside.service.DischargeSummaryService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class DischargeSummaryView implements Serializable {

    private String selectedPatientCHINumber;

    private List<Patient> allPatientList;

   private List<DischargeSummary> dischargeSummaryList;

    @Inject
    private DataPersistance dataPersistance;


    @Inject
    private DischargeSummaryService dischargeSummaryService;


    @Inject
    private Navigation navigation;





    @Inject
    private DischargeFormView dischargeFormView;


    @PostConstruct
    public void init() {
        updatePatientList();
    }



    public void updatePatientList()
    {
        allPatientList = dataPersistance.getAllPatients();
    }


    public void selectPatient() {
        System.out.println("select patient:" + selectedPatientCHINumber);
        try {

            dischargeSummaryList = dischargeSummaryService.getDischargeSummariesforPatient(selectedPatientCHINumber);

            System.out.println(dischargeSummaryList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getPatientLabel(Patient patient) {
        return patient.getFirstName() + " " + patient.getLastName() + " [" + patient.getChinumber() + "]";
    }


    public String getSelectedPatientCHINumber() {
        return selectedPatientCHINumber;
    }

    public void setSelectedPatientCHINumber(String selectedPatientCHINumber) {
        this.selectedPatientCHINumber = selectedPatientCHINumber;
    }


    public void editForm(DischargeSummary dischargeSummary){
        System.out.println(dischargeSummary);
        //dischargeFormSession.setActiveDischargeSummary(dischargeSummary);

        dischargeFormView.setUpForm(dischargeSummary);

        navigation.updateCurrentPage("DischargeForm.xhtml");
    }



    public List<DischargeSummary> getDischargeSummaryList() {
        return dischargeSummaryList;
    }

    public void setDischargeSummaryList(List<DischargeSummary> dischargeSummaryList) {
        this.dischargeSummaryList = dischargeSummaryList;
    }

    public List<Patient> getAllPatientList() {
        return allPatientList;
    }

    public void setAllPatientList(List<Patient> allPatientList) {
        this.allPatientList = allPatientList;
    }
}
