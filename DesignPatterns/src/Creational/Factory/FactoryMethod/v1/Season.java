package Creational.Factory.FactoryMethod.v1;

public abstract class Season {
    public SeasonType seasonType;
    public abstract Bird getBirdOfSeason();
}
