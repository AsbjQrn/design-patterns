package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AtomReaktor implements Reaktor {

    private Reaktor.Kontrol reaktorKontrol = Kontrol.KOER_UD;

    private List<Observer> observers = new ArrayList<>();

    private int temperatur = 1010;

    private ReaktorKerne reaktorKerne;

    private class ReaktorKerne {

        public void saenkTemperatur() throws InterruptedException {
            temperatur--;
            Thread.sleep(500);
            notifyObservers();
        }

        public void haevTemperatur() throws InterruptedException {
            temperatur++;
            Thread.sleep(500);
            notifyObservers();
        }

    }

    public AtomReaktor() throws InterruptedException {
        this.reaktorKerne = new ReaktorKerne();
    }

    public void kontrollerCadmiumStaenger() throws InterruptedException {

        switch (reaktorKontrol) {

            case KOER_UD:
                reaktorKerne.haevTemperatur();


            case KOER_IND:
                reaktorKerne.saenkTemperatur();

        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() throws InterruptedException {
        for (Observer observer : observers) {


            Reaktor.Kontrol kontrol = observer.update();

            if (kontrol != Kontrol.INGEN_AENDRING) {
                reaktorKontrol = kontrol;
            }
        }
        kontrollerCadmiumStaenger();
    }

    public int getState() {
        return temperatur;
    }
}
