package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = var.nextInt();
        }
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            dp[i] = dp[i+1] + arr[i+1];
        }
        for(int p:dp){
            System.out.print(p+" ");
        }
    }
}