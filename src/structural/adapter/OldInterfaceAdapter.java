package structural.adapter;

public class OldInterfaceAdapter implements NewInterface{


    OldInterface oldButWise = new OldFunctionalityStillDoingItsJob();

    @Override
    public void saySomeThingNew() {

        oldButWise.oldWisdomStillWorthGold();


    }
}
