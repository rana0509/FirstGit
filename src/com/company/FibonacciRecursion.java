package com.company;
import java.util.*;

public class FibonacciRecursion {
    static int findFibonacci(int n){
        if(n<=1)
            return n;
        else{
            return findFibonacci(n-1)+findFibonacci(n-2);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number->");
        int n=sc.nextInt();
        System.out.println("Fibonacci:"+findFibonacci(n));
 }
}
