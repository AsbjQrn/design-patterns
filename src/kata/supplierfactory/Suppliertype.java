package kata.supplierfactory;

public enum Suppliertype {

    SQL_PNR("PNR"),
    PRESENT_PAST(null),
    PRESENT(null),
    PRESENT_FUTURE(null),
    FUTURE(null),
    PAST(null);

    private final String helpervalue;

    Suppliertype(String helpervalue) {
        this.helpervalue = helpervalue;
    }
}
