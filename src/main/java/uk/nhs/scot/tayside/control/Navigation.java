package uk.nhs.scot.tayside.control;

import org.primefaces.PrimeFaces;
import uk.nhs.scot.tayside.view.DischargeSummaryView;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Navigation implements Serializable {


    @Inject
    private DischargeSummaryView dischargeSummaryView;

    private String currentPage = "DischargeSummary.xhtml";

    public void updateCurrentPage(String newPage) {
        this.currentPage = newPage;
        updateContent(newPage);
        PrimeFaces.current().ajax().update("maincontent");
    }


    private void updateContent(String newPage) {
        System.out.println("updateContent:" + newPage);
        if (newPage.equals("DischargeSummary.xhtml")) {
            dischargeSummaryView.updatePatientList();
        }
    }


    public String getCurrentPage() {

        return currentPage;


    }


}
