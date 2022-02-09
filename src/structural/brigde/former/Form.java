package structural.brigde.former;

import structural.brigde.farver.Farve;

public abstract class Form {

    private Farve farve;

    public Form(Farve farve){
        this.farve = farve;
    }

    public void  hvadErJeg(){

        System.out.println("Jeg er en " + this.getClass().getSimpleName() + " og jeg er " + farve.jegEr());
    }

}
