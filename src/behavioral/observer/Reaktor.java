package behavioral.observer;

public interface Reaktor {


    public enum Kontrol {KOER_UD, KOER_IND, INGEN_AENDRING}
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers() throws InterruptedException;
    int getState();

}
