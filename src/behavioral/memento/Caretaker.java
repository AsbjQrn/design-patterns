package behavioral.memento;

public class Caretaker {

    public static void main(String args[]){

        Memento savedState;

        Originator originator = new Originator();

        originator.buildText("Original text");

        savedState = originator.saveStateInMemento();

        originator.buildText(" og mere text som ikke er original");
        originator.buildText(" og mere crap som ikke er original");



        System.out.println("Original text: " + savedState.getText());

        System.out.println("Bearbejdet ikke original text før restore via memento: " + originator.getText().toString());

        originator.restoreStateFromMemento(savedState);

        System.out.println("Text efter restore via memento: " + originator.getText().toString());


    }

}
