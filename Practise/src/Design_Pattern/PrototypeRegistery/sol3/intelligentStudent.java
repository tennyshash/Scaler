package Design_Pattern.PrototypeRegistery.sol3;

public class intelligentStudent extends student {
    private int iq;
    intelligentStudent (intelligentStudent other){
        super(other);
        this.iq=other.iq;
    }



    public student copy(){
        return new intelligentStudent(this);
    }
}
