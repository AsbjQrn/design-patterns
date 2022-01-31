package creational.builder.kata.a;

public class BygBlondine {


    public static void main(String[] args ){

        Blondine blondine = new Blondine.Builder().withBhstorrelse('G').withHoftemaal(50).withHojde(165).withTaljemaal(20).build();


        System.out.println("Hej jeg er en custombygget blondine - mine mål er: " + blondine.toString());

    }
}
