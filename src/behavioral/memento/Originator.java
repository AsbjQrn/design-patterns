package behavioral.memento;

public class Originator {

    private StringBuilder text = new StringBuilder();

    public void buildText(String text){
        this.text.append(text);
    }

    public Memento saveStateInMemento(){
        return new Memento(this.text.toString());
    }

    public void restoreStateFromMemento(Memento memento){
        this.text = new StringBuilder(memento.getText());
    }

    public StringBuilder getText() {
        return text;
    }
}
