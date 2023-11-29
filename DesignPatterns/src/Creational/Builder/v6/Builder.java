package Creational.Builder.v6;

public class Builder {
    String name;
    int age;
    double psp;

    String batch;

    String universityName;
    char gender;

    public Student build() throws Exception {
        if(!validate()) {
            throw new Exception("Please provide correct parameters");
        }
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Builder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public Builder setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public boolean validate() {
        if(name == null || age < 25) {
            return false;
        }
        if(age > 25 && psp < 90.0) {
            return false;
        }
        return true;
    }
}
