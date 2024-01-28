package Creational.Factory.FactoryMethod.v0;

public class Client {
    public static void main(String[] args) {
        // Factory Method Design Pattern allows to have mapping between corresponding classes in 2 inheritances
        // Purpose of Factory:
        // 1. To create a new object
        // 2. Based on condition create corresponding object
        // Existence of method whose only purpose is to create an object of corresponding class

        // In our case, suppose we have a season class which has multiple Season Types
        Season s = new Season();
        s.seasonType = SeasonType.SUMMER;

        // And there is Bird a class which has multiple BirdTypes.
        // But based on the season type we want to create the happiest bird of that season.
        // Now if season was a enum, we could have directly created a BirdFactory and do the corresponding
        // business logic there. But here it is a class.
        // So we create a getHappiestBirdOfSeason in Bird to get the corresponding object of Bird Type
        Bird b = Bird.getHappiestBirdOfSeason(s);

        // Here, we are able to create an object of the Bird. But for every new Season introduced,
        // we might need to add that season type in Bird class also, which is not a good idea.
        // So, in order to reduce this effort, we move to the next approach.

    }




}
