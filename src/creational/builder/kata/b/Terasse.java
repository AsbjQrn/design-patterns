package creational.builder.kata.b;

import java.math.BigDecimal;

public final class Terasse {

    private int areal;
    private String traesort ;
    private BigDecimal pris;

    private Terasse(Builder builder){
        this.areal = builder.areal;
        this.traesort = builder.traesort;
        this.pris = builder.pris;
    }

    public static class Builder {

        private int areal;
        private String traesort ;
        private BigDecimal pris;

        public Builder withAreal(int areal){
            this.areal = areal;
            return this;
        }

        public Builder withTraesort(String traesort){
            this.traesort = traesort;
            return this;
        }

        public Builder withPris(BigDecimal pris){
            this.pris = pris;
            return this;
        }

        public Terasse build(){
            return new Terasse(this);
        }




    }

    @Override
    public String toString() {
        return "Terasse{" +
                "areal=" + areal +
                ", traesort='" + traesort + '\'' +
                ", pris=" + pris +
                '}';
    }
}
