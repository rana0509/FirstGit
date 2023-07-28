package com.company;

public class autoBioGraphicalNumber {
    public static void main(String[] args) {
        String input="1,2,1,0";
        int countZero= Character.getNumericValue(1);
        int countOne=input.charAt(1);
        System.out.println(countZero);
        int zero=0;
        int one=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==0){
                zero++;
            }
            if(input.charAt(i)==1){
                one++;
            }

        }
        if(countZero==zero && countOne==one){
            int duplicate=0;
            for(int i=0;i<input.length()-1;i++){
                for(int j=i+1;j<input.length();j++){
                    if(input.charAt(i)==input.charAt(j)){
                        duplicate++;
                    }

                }

            }
            int ans=input.length()-duplicate;
            System.out.println(ans);
        }
        else
            System.out.println("0");
    }
}
