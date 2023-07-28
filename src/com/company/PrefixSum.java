package com.company;
import java.util.*;


public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The length of the Array->");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " +n+ " Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        for(int an:arr){
            System.out.println(an);
        }
    }
}
