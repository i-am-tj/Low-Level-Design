package example.v5;

public class Sparrow extends Bird implements FlyableBird {
    FlyingBehaviour fb;
    public Sparrow(FlyingBehaviour fb) {  //Dependency Injection
        this.fb = fb;
    }
    @Override
    public void fly() {
        fb.makeFly();
    }

}
