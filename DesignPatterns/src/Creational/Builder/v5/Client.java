package Creational.Builder.v5;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws Exception {
        // In this version, we are using Builder class.
        Builder b = new Builder();
        b.setName("Tanuj");
        b.setAge(26);
        b.setPsp(89.6);

        if(!b.validate()) {
            throw new Exception("Builder threw an exception");
        }
        Student s = new Student(b);

        // But does this solution really look nice?
        // Though it solves our problem, can we really make the solution look like student.create().setName().setAge()
        // Hence we will look at the nearest to final solution - v6

    }
}
