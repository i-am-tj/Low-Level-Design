package example.v4;

public class Sparrow extends Bird implements FlyableBird{
    FlyingBehaviour fb = new SlowFlyingBehaviour();
    @Override
    public void fly() {
       fb.makeFly();
    }

}
