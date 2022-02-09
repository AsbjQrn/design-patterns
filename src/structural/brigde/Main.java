package structural.brigde;

import structural.brigde.farver.Lilla;
import structural.brigde.farver.Pink;
import structural.brigde.former.Cirkel;
import structural.brigde.former.Firkant;
import structural.brigde.former.Form;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String... args){

        List<Form> former = new ArrayList<>();
        former.add(new Cirkel(new Pink()));
        former.add(new Firkant(new Pink()));
        former.add(new Firkant(new Lilla()));

        former.forEach(form -> form.hvadErJeg());

    }
}
