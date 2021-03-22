package structural.decorator;

public class FirkantDecorator extends ShapeDecorator {

    public FirkantDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void writeYourSelf() {

        System.out.println("Jeg er svampebob-firkant");

    }
}
