package kata.supplierfactory;

import java.util.function.Supplier;

public class Runner {


    public static void main(String... args) {



        Supplier supplier;

        supplier = SupplierFactory.getSupplier(Suppliertype.PRESENT_PAST.toString());
        supplier.get();

        supplier = SupplierFactory.getSupplier("EKSISTERER_IKKE");
        supplier.get();

    }
}
