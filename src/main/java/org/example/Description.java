package org.example;

import org.springframework.stereotype.Component;

@Component
public class Description {
    private int Attack;
    private int Defense;
    private int HP;
    private int speed;

    public int getAttack() {
        return Attack;
    }
    public int getDefense() {
        return Defense;
    }
    public int getHP() {
        return HP;
    }
    public int getSpeed() {
        return speed;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }
    public void setHP(int hp) {
        HP = hp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void Sout() {
        System.out.println("Characteristic:");
        System.out.println("Attack = "+getAttack());
        System.out.println("Defense = "+getDefense());
        System.out.println("HP = "+getHP());
    }
}
