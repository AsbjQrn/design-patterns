package behavioral.mediator.eksempel;

public class Snakkehoved1 implements Snakkehoved {


    private final Messenger messenger;

    Snakkehoved1(Messenger messenger){
        this.messenger = messenger;
    }

    @Override
    public void snakSnakSnak(String snak) {
        messenger.snakkelak(this, snak);
    }
}
