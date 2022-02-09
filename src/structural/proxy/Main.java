package structural.proxy;

public class Main {

    public static void main(String... args){
        ExpensiveObjectInterface proxxy = new Proxy();

        proxxy.process();
        proxxy.process();
        proxxy.process();
        proxxy.process();
        proxxy.process();
    }
}
