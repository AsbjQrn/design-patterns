package kata.supplierfactory;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


/**
 * Klasse der bruges til at gøre alle feltværdier fra en servicekonfigurationfil til suppliers.
 * dette udnyttes til at levere præfabrikerede suppliers som kan lave randomværdier, hente sqlværdier eller hvad der nu er behov for.
 * Hvis den configurerede værdi, ikke findes som en supplier, wrappes den i en supplier der leverer værdien selv,
 * således at interfacet for alle værdier er ens og gennem en supplier.
 *
 */
public class SupplierFactory {

    private static final Supplier presentPast = new PresentPast();
    private static final List<Suppliertype> suppliers = Arrays.asList(Suppliertype.values());

    public static Supplier supplierOf(String configurationValue) {

        if (suppliers.contains(configurationValue)) {
            switch (Suppliertype.valueOf(configurationValue)) {
                case PRESENT_PAST:
                    return presentPast;
            }
        }
        return (() -> configurationValue);

    }

}
