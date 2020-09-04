package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] MASSIVE = new int[]{ 1,2,3,4,5 };
        int sumMass= 0;
        for (int i = 0; i < 5; i++){
        System.out.println("Element at index " + i + " : "+ MASSIVE[i]);
        sumMass=sumMass+i; }


        for(int i : MASSIVE){
            System.out.println("Value: " + i);
        }
    }
}
