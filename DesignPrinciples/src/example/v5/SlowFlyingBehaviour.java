package example.v5;

public class SlowFlyingBehaviour implements FlyingBehaviour {
    @Override
    public void makeFly() {
        System.out.println("Flies really slow");
    }
}
