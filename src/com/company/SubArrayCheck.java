package com.company;
import java.util.*;

public class SubArrayCheck {
    static boolean check(int[]arr,int n){
        int total_sum=0000;
        for(int i=0;i<n;i++){
          total_sum+=arr[i];
        }
        int prefx=0;
        int suffx=0;
        for(int i=0;i<n;i++){
            prefx+=arr[i];
            suffx=total_sum-prefx;
            if(prefx==suffx)
                return true;


        }

       return false;
    }

    public static void main(String[] args) {
        int[] arr ={5,2,3,4};
        int n=arr.length;
        boolean ans=check(arr,n);
        System.out.println(ans);

    }
}
