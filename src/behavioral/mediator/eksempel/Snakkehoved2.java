package behavioral.mediator.eksempel;

public class Snakkehoved2 implements Snakkehoved {


    private final Messenger messenger;

    Snakkehoved2(Messenger messenger){
        this.messenger = messenger;
    }

    @Override
    public void snakSnakSnak(String snak) {
        messenger.snakkelak(this, snak);
    }
}
