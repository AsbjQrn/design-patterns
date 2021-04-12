package behavioral.mediator.eksempel;

public class Main {

    public static void main(String[] args){

        Messenger messenger = new Messenger();
        Snakkehoved snakkehoved1 = new Snakkehoved1(messenger);
        Snakkehoved snakkehoved2 = new Snakkehoved2(messenger);


        snakkehoved1.snakSnakSnak("hej jeg har rigtig meget lyst til at snakke ad helvede til ");
        snakkehoved2.snakSnakSnak("fedt for det har jeg også ");
        snakkehoved1.snakSnakSnak("fedt lad os snakke hovedet af");

    }

}
