package Design_Pattern.PrototypeRegistery.sol2;

public class intelligentStudent extends student {
    private int iq;
    intelligentStudent (intelligentStudent other){
        super(other);
        this.iq=other.iq;
    }
}
