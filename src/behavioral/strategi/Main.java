package behavioral.strategi;

import java.util.List;

public class Main {

    public static void main (String[] args){


        List<Context> strategies = List.of(new Context(new AgressiveStrategi()), new Context(new PassiveStrategi()));

        strategies.forEach(strategy -> strategy.executeStrategy());

    }

}
