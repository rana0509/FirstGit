package com.company;

public class Polymorphism {
    public static void main(String[] args) {
        OverLoading obj_loading=new OverLoading();
        obj_loading.sum();
        obj_loading.sum(6,6);
        obj_loading.sum(2,4,8);
        OverRidding obj_ridding=new OverRidding();
        obj_ridding.sum();

    }
}
class OverLoading{
    void sum(){
        System.out.println(5+6);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
class OverRidding extends OverLoading{
    void sum(){
        System.out.println("Different Implementation of Sum Method - its method OveRridding");
    }
}
