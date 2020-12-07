package uk.nhs.scot.tayside.service;

import uk.nhs.scot.tayside.domain.dataaccess.DataPersistance;
import uk.nhs.scot.tayside.domain.dataaccess.DataPersistanceTest;
import uk.nhs.scot.tayside.domain.entity.DischargeFormEntry;
import uk.nhs.scot.tayside.dto.DischargeSummary;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class FormUpdateService implements Serializable {

    @Inject
    private DataPersistance dataPersistance;


    public void saveDischargeFormEntrytoDatabase(DischargeFormEntry dischargeFormEntry) {
        dataPersistance.saveDischargeFormEntrytoDatabase(dischargeFormEntry);
    }



    public DischargeFormEntry getLatestFormforAdmission(DischargeSummary dischargeSummary)
    {
        DischargeFormEntry dischargeFormEntry = null;

        List<DischargeFormEntry> dischargeFormEntries = dataPersistance.searchFormsforAdmission(dischargeSummary);

        System.out.println("dischargeFormEntries");
        System.out.println(dischargeFormEntries);

        if(dischargeFormEntries!=null&& !dischargeFormEntries.isEmpty())
        {



        dischargeFormEntries.sort(new Comparator<DischargeFormEntry>() {
            @Override
            public int compare(DischargeFormEntry o1, DischargeFormEntry o2) {
                return o2.getForm_version() - o1.getForm_version() ;
            }
        });
            dischargeFormEntry=dischargeFormEntries.get(0);
        }

        System.out.println("dischargeFormEntries2");
        System.out.println(dischargeFormEntries);

        return dischargeFormEntry;
    }


}




