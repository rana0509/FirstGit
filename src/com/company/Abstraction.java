package com.company;

public class Abstraction {
    public static void main(String[] args) {
        Pig obj=new Pig();
        obj.AnimalSound();
        obj.sleep();

    }
}
abstract class AnimalSound{
    abstract void AnimalSound();
    void sleep(){
        System.out.println("zzZZ");
    }



}
class Pig extends AnimalSound{
    void AnimalSound(){
        System.out.println("The Pig Says-We We ");
    }
}

