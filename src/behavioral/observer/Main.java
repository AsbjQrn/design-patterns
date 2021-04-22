package behavioral.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AtomReaktor reaktor = new AtomReaktor();

        Observer forlav = new TemperaturForLav(reaktor);
        Observer forhoj = new TemperaturForHoj(reaktor);
        Observer ok = new TemperaturOk(reaktor);

        reaktor.kontrollerCadmiumStaenger();



    }
}
