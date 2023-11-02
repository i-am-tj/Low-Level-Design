package example.v5;

public class Eagle extends Bird implements FlyableBird {
    FlyingBehaviour fb;

    public Eagle(FlyingBehaviour fb) { //Dependency Injection
        this.fb = fb;
    }
    @Override
    public void fly() {
        fb.makeFly();
    }
}
