package Basics.Comparisons.v1;

import java.util.Comparator;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Comparators
    public static final Comparator<Human> COMPARE_BY_NAME = new Comparator<Human>() {
        @Override
        public int compare(Human o1, Human o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static final Comparator<Human> COMPARE_BY_AGE = new Comparator<Human>() {
        @Override
        public int compare(Human o1, Human o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    };

}
