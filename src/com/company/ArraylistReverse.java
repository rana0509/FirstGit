package com.company;
import java.util.*;


public class ArraylistReverse {
    public static void main(String[] args) {
       ArrayList<Integer> input=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the list size->");
        int n=sc.nextInt();
        System.out.println("Enter the arralist elements");
       for(int i=0;i<n;i++){

          int value=sc.nextInt();
          input.add(value);
       }
        System.out.println("Before Reverse");
       print(input);
       Collections.reverse(input);
        System.out.println("After Reverse");
        print(input);
    }
    public static void print(ArrayList<Integer>list){
        System.out.println(list);
    }
}
