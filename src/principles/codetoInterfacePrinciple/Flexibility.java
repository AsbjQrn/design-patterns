package principles.codetoInterfacePrinciple;

interface Hjul {
    void koer();
}

class HjulMedAlufaelge implements Hjul {

    @Override
    public void koer() {

    }
}

class VinterHjul implements Hjul {

    @Override
    public void koer() {

    }
}

/**
 * Denne bil er besværlig at skifte hjul på
 */
class UFleksibelBil {
    HjulMedAlufaelge hjul = new HjulMedAlufaelge();
}

/**
 * Denne bil er nemmest at skifte hjul på
 */
class FleksibelBil1 {

    private Hjul hjul;

    public void Skifthjul(Hjul hjul) {
        this.hjul = hjul;
    }
}

/**
 * Denne bil er nemmest at skifte hjul på
 */
class FleksibelBil2 {

    private final Hjul hjul;

    public FleksibelBil2(Hjul hjul) {
        this.hjul = hjul;
    }


}

