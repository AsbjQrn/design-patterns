package kata.supplierfactory;

import java.util.function.Supplier;

public class Runner {


    public static void main(String... args) {



        Supplier supplier;

        supplier = SupplierFactory.supplierOf(Suppliertype.PRESENT_PAST.toString());
        System.out.println(supplier.get());

        supplier = SupplierFactory.supplierOf("EKSISTERER_IKKE");
        System.out.println(supplier.get());

    }
}
