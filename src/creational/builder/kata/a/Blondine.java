package creational.builder.kata.a;

public class Blondine {

    private final int hojde;
    private final int hoftemaal;
    private final int taljemaal;
    private final char bhstorrelse;

    private Blondine(int hojde, int hoftemaal, int taljemaal, char bhstorrelse) {
        this.hojde = hojde;
        this.hoftemaal = hoftemaal;
        this.taljemaal = taljemaal;
        this.bhstorrelse = bhstorrelse;
    }

    public static class Builder {

        private int hojde;
        private int hoftemaal;
        private int taljemaal;
        private char bhstorrelse;

        public Builder withHojde(int hojde) {
            this.hojde = hojde;
            return this;
        }

        public Builder withHoftemaal(int hoftemaal) {
            this.hoftemaal = hoftemaal;
            return this;
        }

        public Builder withTaljemaal(int taljemaal) {
            this.taljemaal = taljemaal;
            return this;
        }

        public Builder withBhstorrelse(char bhstorrelse) {
            this.bhstorrelse = bhstorrelse;
            return this;
        }

        public Blondine build() {
            return new Blondine(this.hojde, this.hoftemaal, this.taljemaal, this.bhstorrelse);
        }

    }

    @Override
    public String toString() {
        return "Blondine{" +
                "hojde=" + hojde +
                ", hoftemaal=" + hoftemaal +
                ", taljemaal=" + taljemaal +
                ", bhstorrelse=" + bhstorrelse +
                '}';
    }
}
