package uk.nhs.scot.tayside.view;

import org.primefaces.PrimeFaces;
import org.primefaces.event.RowEditEvent;
import uk.nhs.scot.tayside.domain.dataaccess.DataPersistance;
import uk.nhs.scot.tayside.domain.entity.Patient;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class AddPatientView implements Serializable {


    @Inject
    private DataPersistance dataPersistance;


    private List<Patient> allPatientList;


    private Patient patientToAdd;

    private Patient patientToDelete;


    @PostConstruct
    public void init() {
        patientToAdd = new Patient();

        allPatientList = dataPersistance.getAllPatients();

        System.out.println(allPatientList);
    }


    public void addPatient() {
        System.out.println("AddPatientView.addPatient " + patientToAdd);

        dataPersistance.savePatienttoDatabase(patientToAdd);
        allPatientList = dataPersistance.getAllPatients();

        displayMessage("Patient Added",patientToAdd.toString());
        patientToAdd = new Patient();
    }


    public void createNewPatientToAdd()
    {
        patientToAdd = new Patient();
    }


    public void deletePatient(Patient patientToDelete) {
        System.out.println("delete:" + patientToDelete);
        dataPersistance.deletePatient(patientToDelete);
        allPatientList = dataPersistance.getAllPatients();
        displayMessage("Patient Deleted",patientToDelete.toString());
    }


    public void editPatient(RowEditEvent<Patient> event) {

        Patient patientToUpdate = event.getObject();
        System.out.println("patientToUpdate:" + patientToUpdate);
        dataPersistance.updatePatient(patientToUpdate);
        allPatientList = dataPersistance.getAllPatients();

        displayMessage("Patient Updated",patientToUpdate.toString());



    }


    /**
     * Displays a mesage on the scren
     * @param header the heading to display
     * @param detail the detail to display
     */
    private void displayMessage(String header, String detail) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(header, detail));
        PrimeFaces.current().ajax().update("growl");
    }




    public Patient getPatientToAdd() {
        return patientToAdd;
    }

    public void setPatientToAdd(Patient patientToAdd) {
        this.patientToAdd = patientToAdd;
    }


    public List<Patient> getAllPatientList() {
        return allPatientList;
    }

    public Patient getPatientToDelete() {
        return patientToDelete;
    }

    public void setPatientToDelete(Patient patientToDelete) {
        this.patientToDelete = patientToDelete;
    }
}
