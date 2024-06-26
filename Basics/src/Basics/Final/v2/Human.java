package Basics.Final.v2;

public final class Human {
    private final String name;
    private final int age;
    private String weight;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    final void display() {
        System.out.println("Human - Name: " + this.getName() + " Age: " + this.getAge());
    }

    void displayAll() {
        System.out.println("Human - Name: " + this.getName() + " Age: " + this.getAge() + " Weight: " + this.getWeight());
    }

}
