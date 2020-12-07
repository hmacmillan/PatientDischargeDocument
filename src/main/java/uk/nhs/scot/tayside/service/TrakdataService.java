package uk.nhs.scot.tayside.service;

import uk.nhs.scot.tayside.dto.AdmissionSummaryEntry;

import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class TrakdataService implements Serializable {


    public List<AdmissionSummaryEntry> getAdmissionsForPatient(String chinumber) throws IOException {

        System.out.println("get admisions for patient");


        // chinumber = "1105205010";
//
//
        String resourceurl = "http://devvm06.tayside.scot.nhs.uk:8080/IntegrationEngine/PortalAdmissionsAndAppointments/v1/Admissions/" + chinumber;

        HttpURLConnection conn;

        URL url = new URL(resourceurl);

        conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        conn.setRequestProperty("Content-Type", "application/json");

        conn.setRequestProperty("systemName", "clinical_portal");
        conn.setRequestProperty("systemPassword", "password1");

        conn.setDoOutput(true);

        ObjectMapper mapper = new ObjectMapper();


        List<AdmissionSummaryEntry>  admissionSummaryEntries = mapper.readValue(conn.getInputStream(),new TypeReference<List<AdmissionSummaryEntry>>(){});

        System.out.println("admissionSummaryEntries");
        System.out.println(admissionSummaryEntries);

        return admissionSummaryEntries;


    }




}
