package behavioral.chainofcommand;

public class UdbetalHalvtredsere extends UdbetalingsEnhed {


    @Override
    public void udbetal(int belob) {

        int antalHalvtredsere = belob / 50;
        int remainder = belob % 50;
        System.out.println(String.format("Udbetaler %d antal halvtredsere", antalHalvtredsere));
        if (remainder > 0 && nextUdbetalingsEnhed != null) {
            nextUdbetalingsEnhed.udbetal(remainder);
        }


    }
}
