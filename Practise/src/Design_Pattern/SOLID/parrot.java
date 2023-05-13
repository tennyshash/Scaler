package Design_Pattern.SOLID;

public class parrot extends bird implements flyingBird,flyingBehaviour{
    @Override
    public void walk() {
        System.out.println("Parrot walks while dancing");
    }

    @Override
    public void makeFly() {
        flyingBehaviour Pfb;
        Pfb =new slowFlying();
        System.out.print("Parrot ");
        Pfb.makeFly();
    }

    @Override
    public void fly() {
        makeFly();
    }
}
