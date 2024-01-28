package Creational.Factory.FactoryMethod.v0;

public class Bird {
    public String name;

    public static Bird getHappiestBirdOfSeason(Season season) {
        if(season.seasonType == SeasonType.SUMMER) {
            return new Hen();
        } else if(season.seasonType == SeasonType.WINTER) {
            return new Sparrow();
        } else if(season.seasonType == SeasonType.AUTUMN) {
            return new Peacock();
        }
        return null;
    }
}
