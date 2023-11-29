package Creational.Builder.v7;

public class Student {
    private String name;
    private int age;
    private double psp;

    private String batch;

    private String universityName;
    private char gender;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder b) {
        this.name = b.name;
        this.age = b.age;
        this.psp = b.psp;
    }

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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static class Builder {
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
}
