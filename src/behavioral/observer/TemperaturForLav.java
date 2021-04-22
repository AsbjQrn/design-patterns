package behavioral.observer;


public class TemperaturForLav implements Observer {

    private final static int forlavt = 990;

    private Reaktor reaktor;


    public TemperaturForLav(Reaktor reaktor) {
        this.reaktor = reaktor;
        reaktor.attach(this);
    }

    @Override
    public Reaktor.Kontrol update() {

        if (reaktor.getState() < forlavt) {
            System.out.println(this.getClass() + "temperaturen er for lav celcius:" + reaktor.getState());
            return Reaktor.Kontrol.KOER_UD;
        }

        return Reaktor.Kontrol.INGEN_AENDRING;

    }

}
