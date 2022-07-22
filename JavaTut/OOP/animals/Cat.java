package javatut.oop.animals;

public class Cat extends Animal {
    public Cat() {
        super(); // call it anyway.
    }

    public void Name(String nm) {
        this.Name = nm;
    }

    public void Age(int age) {
        this.Age = age;
    }
    
    public void sleep() {
        System.out.println("スースー");
    }
}
