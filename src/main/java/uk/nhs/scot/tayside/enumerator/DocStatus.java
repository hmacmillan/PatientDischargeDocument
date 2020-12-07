package uk.nhs.scot.tayside.enumerator;

public enum DocStatus {

    INITIAL_NOT_STARTED_00(0, "Initial – Not started"),
    INITIAL_IN_PROGRESS_01(1, "Initial - In Progress"),
    INITIAL_SO_AWAITING_PHARMACIST_SIGN_OFF_02(2, "Initial -  Signed Off – Awaiting Pharmacist sign off"),
    INITIAL_SO_DISPENSE_REQUIRED_03(3,"Initial – Signed Off – Dispense Required"),
    INITIAL_SO_AWAITING_REVIEW_OF_SUPPLY_04(4, "Initial – Signed Off – Awaiting Review of Supply"),
    INITIAL_SO_DISPENSED_AWAITING_CHECK_05(5,"Initial – Signed Off – Dispensed and awaiting check"),
    INITIAL_SO_DISPENSE_NOT_REQUIRED_06(6,"Initial – Signed Off – Dispense Not Required"),
    INITIAL_SO_DISPENSED_CHECKED_07(7,"Initial – Signed Off – Dispensed and checked"),
    INITIAL_SO_PHARMACY_SIGN_OFF_NOT_REQUIRED_08(8,"Initial – Signed Off – Pharmacy Sign Off – Not required"),
    FINAL_IN_PROGRESS_09(9,"Final -  In Progress"),
    FINAL_SIGNED_OFF_10(10,"Final – Signed Off");

    private String description;
    private int documentStatusID;


    DocStatus(int documentStatusID, String description) {
        this.description = description;
        this.documentStatusID = documentStatusID;
    }


    public String getDescription() {
        return description;
    }
}
