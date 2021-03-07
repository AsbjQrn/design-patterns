package command;

public class Client_main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Reciever reciever = new Reciever();
        invoker.executeCommand(new OpenCommand(reciever));
        invoker.executeCommand(new CloseCommand(reciever));
        invoker.executeCommand(new RepairCommand(reciever));
    }
}
