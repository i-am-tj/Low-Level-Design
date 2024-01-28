package Creational.Prototype.v4;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent() {
        super();
        this.iq = 150;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }

}
