package command;

public class CloseCommand implements Command {

    private Reciever reciever;

    public CloseCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.close();
    }
}
