package behavioral.command;

public class RepairCommand implements Command {

    private Reciever reciever;

    public RepairCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.repair();
    }
}
