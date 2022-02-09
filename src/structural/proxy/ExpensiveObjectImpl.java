package structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObjectInterface{

    public ExpensiveObjectImpl(){
        System.out.println("Jeg konstruerer nu en masse dyre ting der tager lang tid");
    }

    public void process(){
        System.out.println("Doing my thing");
    }
}
