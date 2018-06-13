package com.bootcamp;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    //colby_davis1@homedepot.com
    public static void main(String[] args) {
        //Given these string of digits:
        String numbersString1 = "12378923254";
        String numbersString2 = "53625484376";
        String numbersString3 = "71941648682";

        String[] arr = {numbersString1, numbersString2, numbersString3};

        System.out.println(sumNumbers(arr));



    }
    public static int sumNumbers(String[] str){
        int sum = 0;

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                sum += Character.getNumericValue(str[i].charAt(j));
            }
        }
        return sum;
    }



}
