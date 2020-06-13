package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    static int factorial(int n){
        if(n==1 || n==0) {
            return 1;
        }
        return n * factorial(n-1);

    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int a = var.nextInt();
        System.out.print(factorial(a));

    }
}



























