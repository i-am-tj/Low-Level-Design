package Basics.Cloneable.v2;

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
        Human cloned = (Human) super.clone();
        cloned.dob = (Date) this.dob.clone();
        return cloned;
    }

    public void display(){
        System.out.println("Human - Name: " + getName() + " Age: " + ((System.currentTimeMillis() - getDob().getTime())/ (1000L * 60 * 60 * 24 * 365)));
    }
}
