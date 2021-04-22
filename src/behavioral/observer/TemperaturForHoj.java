package behavioral.observer;


public class TemperaturForHoj implements Observer {

    private final static int forhoej = 1000;

    private Reaktor reaktor;


    public TemperaturForHoj(Reaktor reaktor) {
        this.reaktor = reaktor;
        reaktor.attach(this);
    }

    @Override
    public Reaktor.Kontrol update() {

        if (reaktor.getState() > forhoej) {
            System.out.println(this.getClass() + "Temperaturen er for høj, celcius: " + reaktor.getState());
            return Reaktor.Kontrol.KOER_IND;

        }
        return Reaktor.Kontrol.INGEN_AENDRING;
    }
}
