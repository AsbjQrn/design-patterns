package kata.supplierfactory;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.function.Supplier;

public class PresentPast extends DateRandomizer implements Supplier<LocalDate> {


    @Override
    public LocalDate get() {

        return LocalDate.ofInstant(between(Instantenum.MIN_DATE_PAST, Instantenum.MIN_DATE_PAST), ZoneId.systemDefault() );
    }
}
