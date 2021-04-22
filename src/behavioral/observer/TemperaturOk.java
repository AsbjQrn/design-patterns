package behavioral.observer;


public class TemperaturOk implements Observer {

    private final static int forhoej = 1001;
    private final static int forlav = 989;

    private Reaktor reaktor;


    public TemperaturOk(Reaktor reaktor) {
        this.reaktor = reaktor;
        reaktor.attach(this);
    }

    @Override
    public Reaktor.Kontrol update() {

        if (reaktor.getState() < forhoej && reaktor.getState() > forlav) {
            System.out.println(this.getClass() + "Temperaturen er OK, celcius: " + reaktor.getState());
        }

        return Reaktor.Kontrol.INGEN_AENDRING;

    }
}
