package example.v4;

public class Eagle extends Bird implements FlyableBird {
    FlyingBehaviour fb = new FastFlyingBehaviour();

    @Override
    public void fly() {
        fb.makeFly();
    }
}
