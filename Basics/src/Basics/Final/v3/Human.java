package Basics.Final.v3;

import java.util.Date;

public final class Human {
    private String name;
    private Date dob; // instead of age we will use Date


    public Human(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    // To ensure immutability we will only have getters and no setters
    public String getName() {
        return name;
    }
    public Date getDob() {
        return dob;
    }

    public void display() {
        System.out.println("Human - Name: " + getName() + " Age: " + ((System.currentTimeMillis() - getDob().getTime())/ (1000L * 60 * 60 * 24 * 365)));
    }

}
