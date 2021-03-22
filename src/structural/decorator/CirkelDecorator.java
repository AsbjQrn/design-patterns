package structural.decorator;

public class CirkelDecorator extends ShapeDecorator {

    public CirkelDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void writeYourSelf() {

        System.out.println("Jeg er Cirkeline");

    }
}
