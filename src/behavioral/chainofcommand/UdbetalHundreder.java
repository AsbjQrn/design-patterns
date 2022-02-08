package behavioral.chainofcommand;

public class UdbetalHundreder extends UdbetalingsEnhed {


    @Override
    public void udbetal(int belob) {

        int antalHundreder = belob / 100;
        int remainder = belob % 100;
        System.out.println(String.format("Udbetaler %d hundredekronesedler", antalHundreder));
        if (remainder != 0) {
            this.nextUdbetalingsEnhed.udbetal(remainder);
        }


    }
}
