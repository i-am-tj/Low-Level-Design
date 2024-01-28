package Creational.Prototype.v3;

public class IntelligentStudent extends Student {
    int iq;

    @Override
    IntelligentStudent copy() {
        System.out.println("Intelligent Student");
        // super.copy(); -> Does this really help? - No
        IntelligentStudent student = new IntelligentStudent();
        student.iq = this.iq;
        // student.name = this.name; -> since name is private
        return student;
    }
}
