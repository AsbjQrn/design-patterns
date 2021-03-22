package behavioral.command;

public class Reciever {

    public void open(){
        logCommandExecution("Åbner tivoli");
    }

    public void repair(){
        logCommandExecution("Reparerer tivoli");
    }

    public void close(){
        logCommandExecution("Lukker tivoli");
    }


    private void logCommandExecution(String text){
        System.out.println(text);
    }

}
