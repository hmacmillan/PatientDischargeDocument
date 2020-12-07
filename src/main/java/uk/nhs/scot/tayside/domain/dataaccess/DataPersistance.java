package uk.nhs.scot.tayside.domain.dataaccess;

import uk.nhs.scot.tayside.domain.entity.DischargeFormEntry;
import uk.nhs.scot.tayside.domain.entity.Patient;
import uk.nhs.scot.tayside.dto.DischargeSummary;

import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


@Stateless
public class DataPersistance implements Serializable {


    @PersistenceContext(unitName = "SQLServerPersistanceUnit")
    private EntityManager entityManager;

    public void savePatienttoDatabase(Patient patient) {
        entityManager.persist(patient);
    }


    public List<Patient> getAllPatients() {
        TypedQuery<Patient> createQuery = entityManager.createQuery("from Patient", Patient.class);
        List<Patient> resultList = createQuery.getResultList();

        return resultList;
    }

    public void deletePatient(Patient patient) {
        Patient merged = entityManager.merge(patient);
        entityManager.remove(merged);
        entityManager.flush();
    }


    public void updatePatient(Patient patient) {
        entityManager.merge(patient);
        entityManager.flush();
    }


    public void saveDischargeFormEntrytoDatabase(DischargeFormEntry dischargeFormEntry) {
        entityManager.persist(dischargeFormEntry);
    }


    public List<DischargeFormEntry> searchFormsforAdmission(DischargeSummary activeDischargeSummary) {
        String admissionID = activeDischargeSummary.getAdmissionID();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<DischargeFormEntry> criteriaQuery = criteriaBuilder.createQuery(DischargeFormEntry.class);
        Root<DischargeFormEntry> dischargeFormEntryRoot = criteriaQuery.from(DischargeFormEntry.class);
        criteriaQuery.where(criteriaBuilder.equal(dischargeFormEntryRoot.get("admissionID"), admissionID));
        TypedQuery<DischargeFormEntry> q = entityManager.createQuery(criteriaQuery);
        List<DischargeFormEntry> results = q.getResultList();

        return results;

    }

}
