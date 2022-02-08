package behavioral.chainofcommand;

public class UdbetalTiere extends UdbetalingsEnhed{


    @Override
    public void udbetal(int belob) {

        int antalTiere = belob / 10;
        int remainder = belob % 10;
        System.out.println(String.format("Udbetaler %d antal tiere", antalTiere));
        if (remainder > 0 && nextUdbetalingsEnhed != null) {
            nextUdbetalingsEnhed.udbetal(remainder);
        }


    }
}
