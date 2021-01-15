package com.tts;
import java.util.Arrays;
import java.lang.*;

public class Main {

    public static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(int i = 0; i < size; i++){
            result[i] = Math.pow(i, power);
        }
        return result;
    }

    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.print("Your result is: "+ Arrays.toString(result));
    }
}
