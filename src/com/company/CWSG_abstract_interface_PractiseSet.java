package com.company;
// Ques 1:

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing..");
    }
    @Override
    void refill() {
        System.out.println("Refilling Ink..");
    }

    void changeNib(){
        System.out.println("Changing Pen Nib..");
    }
}

// Ques2

interface BasicAnimal{
    public void eat();
    public void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jump");
    }
    void Bite(){
        System.out.println("Bite");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}

public class CWSG_abstract_interface_PractiseSet {
    public static void main(String[] args) {
        FountainPen f = new FountainPen();
        f.changeNib();
        f.refill();
        f.write();

        Human h = new Human();
        h.eat();
        h.sleep();
        h.Bite();
        h.jump();
    }
}
