package org.example;

public class Player {
    private String name;
    private int age;

    public Player() {}
    public Player(String name, int age) {}
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
    public void Sout() {
        System.out.println("Player: " + name +" | " +"Age: " + age);
    }

}
