package behavioral.chainofcommand;

public abstract class UdbetalingsEnhed {

    protected UdbetalingsEnhed nextUdbetalingsEnhed;

    public void setNextUdbetalingsEnhed(UdbetalingsEnhed nextUdbetalingsEnhed) {
        this.nextUdbetalingsEnhed = nextUdbetalingsEnhed;
    }

    public abstract void udbetal(int belob);

}
