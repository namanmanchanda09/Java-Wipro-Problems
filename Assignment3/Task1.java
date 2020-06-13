package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int ans;
        if (n < 10) {
            System.out.println("Single Digit Number");
        } else {
            n /= 10;
            ans = n % 10;
            System.out.println(ans);
        }
    }
}
























