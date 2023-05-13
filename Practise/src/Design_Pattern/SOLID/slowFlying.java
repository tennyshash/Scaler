package Design_Pattern.SOLID;

public class slowFlying implements flyingBehaviour{
    @Override
    public void makeFly() {
        System.out.println(" is flying slow");
    }
}
