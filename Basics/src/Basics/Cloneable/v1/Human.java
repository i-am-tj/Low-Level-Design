package Basics.Cloneable.v1;

import java.util.Date;

public class Human implements Cloneable {
    private String name;
    private Date dob;

    public Human(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display(){
        System.out.println("Human - Name: " + getName() + " Age: " + ((System.currentTimeMillis() - getDob().getTime())/ (1000L * 60 * 60 * 24 * 365)));
    }
}
