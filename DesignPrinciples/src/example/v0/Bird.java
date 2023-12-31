package example.v0;

class Bird {
    private String name;
    private String color;
    private BirdType type;
    private double weight;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(BirdType type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fly() {
        //Violation of SRP
        if(this.type == BirdType.SPARROW) {
            System.out.println(this.name + " can fly");
        } else if(this.type == BirdType.PEACKOCK) {
            System.out.println(this.name + " can't fly");
        } else if(this.type == BirdType.PIGEON) {
            System.out.println(this.name + " can fly");
        }
    }

    public void makeSound() {
        System.out.println(this.name + " makes sound");
    }


}