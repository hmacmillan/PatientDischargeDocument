package uk.nhs.scot.tayside.domain.dataaccess;

import uk.nhs.scot.tayside.domain.entity.DischargeFormEntry;
import uk.nhs.scot.tayside.domain.entity.Patient;
import uk.nhs.scot.tayside.dto.DischargeSummary;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

@Stateless
public class DataPersistanceTest implements Serializable {

    @PersistenceContext(unitName = "SQLServerPersistanceUnitTest")
    private EntityManager entityManager;

//
//    public void saveDischargeFormEntrytoDatabase(DischargeFormEntry dischargeFormEntry) {
//        entityManager.persist(dischargeFormEntry);
//    }
//
//
//    public List<DischargeFormEntry> searchFormsforAdmission(DischargeSummary activeDischargeSummary) {
//        String admissionID = activeDischargeSummary.getAdmissionID();
//
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<DischargeFormEntry> criteriaQuery = criteriaBuilder.createQuery(DischargeFormEntry.class);
//        Root<DischargeFormEntry> dischargeFormEntryRoot = criteriaQuery.from(DischargeFormEntry.class);
//        criteriaQuery.where(criteriaBuilder.equal(dischargeFormEntryRoot.get("admissionID"), admissionID));
//        TypedQuery<DischargeFormEntry> q = entityManager.createQuery(criteriaQuery);
//        List<DischargeFormEntry> results = q.getResultList();
//
//        return results;
//
//    }


//    CriteriaQuery<Pet> cq = cb.createQuery(Pet.class);
//    Root<Pet> pet = cq.from(Pet.class);
//cq.where(cb.equal(pet.get("name"), "Fido"));
//    TypedQuery<Pet> q = em.createQuery(cq);
//    List<Pet> results = q.getResultList();

}
