package behavioral.chainofcommand;

public class Main {



    public static void main(String[] args){
        UdbetalingsEnhed hundrede = new UdbetalHundreder();
        UdbetalingsEnhed halvtredsere = new UdbetalHalvtredsere();
        UdbetalTiere tiere = new UdbetalTiere();

        hundrede.setNextUdbetalingsEnhed(halvtredsere);
        halvtredsere.setNextUdbetalingsEnhed(tiere);

        System.out.println("Udbetal ialt 160 kroner");
        hundrede.udbetal(160);
        System.out.println("Udbetal ialt 12154545 kroner");
        hundrede.udbetal(12154555);
    }
}
