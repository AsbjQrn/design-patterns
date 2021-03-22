package behavioral.command;

public class OpenCommand implements Command {

    private Reciever reciever;

    public OpenCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.open();
    }
}
