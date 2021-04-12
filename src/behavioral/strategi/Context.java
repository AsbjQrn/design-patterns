package behavioral.strategi;

public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(){
        this.strategy.execute();
    }

}
