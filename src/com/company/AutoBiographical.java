package com.company;
import java.util.*;

public class AutoBiographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] input={'2','1','2','0' ,'0'};
        int n=input.length;
        int [] arr=new int[10];

        boolean flag=true;
        for(int i=0;i<input.length;i++){
            int digit=input[i]-'0';
            arr[digit] += 1;
        }
        for(int i=0;i<input.length;i++){
            int digit=input[i]-'0';
            if(arr[i]!=digit){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("AutoBiographical Number");
        }
        else
         System.out.println("Not");

    }
}
