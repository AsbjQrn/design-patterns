package structural.decorator;

import java.util.List;

public class Main {

    public static void main(String[] args){


        List<Shape> shapes = List.of(new Firkant(), new Cirkel(), new FirkantDecorator(new Firkant()), new CirkelDecorator(new Cirkel()));

        shapes.forEach(shape -> shape.writeYourSelf());



    }

}
