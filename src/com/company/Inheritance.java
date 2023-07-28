package com.company;

public class Inheritance {
    public static void main(String[] args) {
        Sub2 obj=new Sub2();
        obj.category();
        obj.brand("MAHINDRA");
        obj.model();



    }
}
class Parent{
    void category(){
        System.out.println("Category:CAR");
    }
}
class Sub1 extends Parent{
    void brand(String a){
        System.out.println("Manufactured By: "+a);
    }
}
class Sub2 extends Sub1{
    void model(){
        System.out.println("Model Name:THAR");
    }

}
