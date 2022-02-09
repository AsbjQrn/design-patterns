package structural.proxy;

import java.util.Objects;

public class Proxy implements ExpensiveObjectInterface {

    private ExpensiveObjectInterface expensiveObjectInterface;

    @Override
    public void process() {

        if (Objects.isNull(expensiveObjectInterface)) {
            System.out.println("Jeg instantierer");
            expensiveObjectInterface = new ExpensiveObjectImpl();
        }
        System.out.println("Jeg processerer");
        expensiveObjectInterface.process();
    }
}
