package Internals.EqualityCheck.v1;

import java.util.Objects;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Human - Name: " + getName() + " Age: " + getAge());
    }

    //Overriding the default implementation of equals() to implement custom logic
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If the reference is same simply return true
        if (obj == null || getClass() != obj.getClass()) return false; // Checks for class object parity
        Human human = (Human) obj; // Else cast it to this object and verify for each parameter
        return getAge() == human.getAge() && Objects.equals(getName(), human.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
