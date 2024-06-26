package Basics.Final.v4;

import java.util.Date;

public final class Human {
    // Also added final to each member though it is not mandatory if private + no setter configuration exists
    private final String name;
    private final Date dob;

    public Human(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime()); // creating a defensive copy
    }

    public String getName() {
        return name;
    }
    public Date getDob() {
        return new Date(dob.getTime()); // Returning a defensive copy to not access the data member directly
    }

    public void display() {
        System.out.println("Human - Name: " + getName() + " Age: " + ((System.currentTimeMillis() - getDob().getTime())/ (1000L * 60 * 60 * 24 * 365)));
    }
}
