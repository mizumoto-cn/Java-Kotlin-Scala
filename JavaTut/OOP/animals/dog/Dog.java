package javatut.oop.animals.dog;

public class Dog {
    private String Name;
    private int Age;
    public void SetName(String nm) {
        Name = nm;
    }

    public void SetAge(int ag) {
        Age = ag;
    }

    public void ShowProfile() {
        System.out.println("名前は、" + Name + "、" + Age + "歳です。");
    }
}
