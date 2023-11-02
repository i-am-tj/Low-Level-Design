package example.v4;

public class SlowFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void makeFly() {
        System.out.println("Flies really slow");
    }
}
