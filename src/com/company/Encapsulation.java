package com.company;
import java.util.*;

public class Encapsulation {
    public static void main(String[] args) {
        Balance obj=new Balance();
        Scanner sc=new Scanner(System.in);
        System.out.println("Show the balance:");
        long n=sc.nextLong();
        obj.setbalance(n);
        obj.getbalance();
       // System.out.println("Rs."+obj.getbalance());





    }
}
class Balance{
    long value;
    void getbalance(){
        System.out.println("Rs."+value);;
    }
    void setbalance(long a ){
        this.value=a;
    }
}
