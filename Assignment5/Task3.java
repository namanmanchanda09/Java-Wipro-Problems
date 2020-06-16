package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int n){
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = var.nextInt();
        }
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            dp[i] = dp[i-1] + arr[i];
        }
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = dp[j];
                if(i>0){
                    sum-=dp[i-1];
                }
                if(isPalindrome(sum)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}











