package kata.supplierfactory;

import java.time.Instant;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class DateRandomizer {

    protected enum Instantenum {

        MIN_DATE_PAST(Instant.ofEpochMilli(LocalDate.of(1855, 1,1).toEpochDay()));


        Instant value;

        Instantenum(Instant ofEpochMilli) {
        }

        public Instant getValue() {
            return value;
        }
    }
    protected static final Instant MIN_DATE_PAST = Instant.ofEpochMilli(LocalDate.of(1855, 1,1).toEpochDay());
    protected static final Instant MAX_DATE_FUTURE = Instant.MAX;
    protected static final Instant PRESENT = Instant.now();
    protected static final Instant TOMORROW = Instant.ofEpochMilli(LocalDate.now().plusDays(1).toEpochDay());
    protected static final Instant YESTERDAY = Instant.ofEpochMilli(LocalDate.now().minusDays(1).toEpochDay());

    /**
     *
     * @param startInclusive
     * @param endExclusive
     * @return
     */
    public static Instant between(Instantenum startInclusive, Instantenum endExclusive) {
        long startSeconds = startInclusive.getValue().getEpochSecond();
        long endSeconds = endExclusive.getValue().getEpochSecond();;
        long random = ThreadLocalRandom
                .current()
                .nextLong(startSeconds, endSeconds);

        return Instant.ofEpochSecond(random);
    }

}
