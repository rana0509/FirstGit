package com.company;
import java.util.*;

import static com.company.ArraylistReverse.print;

public class ArraylistSort {
    public static void main(String[] args) {
        ArrayList<String> unsort=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Unsorted numbers list size");
         int n=sc.nextInt();
        System.out.println("list name's");
         for(int i=0;i<n;i++){
             String value=sc.next();
             unsort.add(value);
         }
        System.out.println("before sort");
        System.out.println(unsort);
        System.out.println("after sort");
        Collections.sort(unsort,Collections.reverseOrder());
        System.out.println(unsort);
    }
}
