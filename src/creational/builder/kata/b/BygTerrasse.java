package creational.builder.kata.b;

import java.math.BigDecimal;

public class BygTerrasse {


    public static void main(String ... args){

       Terasse terasse = new Terasse.Builder().withAreal(20).withTraesort("mahogni").withPris(new BigDecimal(20000)).build();
        System.out.println(terasse.toString());

    }

}
