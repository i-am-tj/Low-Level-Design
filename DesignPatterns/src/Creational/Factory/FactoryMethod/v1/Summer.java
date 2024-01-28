package Creational.Factory.FactoryMethod.v1;

public class Summer extends Season {
    @Override
    public Bird getBirdOfSeason() {
        return new Hen();
    }
}
