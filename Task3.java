package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Scanner var = new Scanner(System.in);
       int n = var.nextInt();
       int[] arr = new int[100];
       int index = 0;
       while (n > 0) {
           arr[index] = n % 2;
           n /= 2;
           index++;
       }
       int count = 0;
       for(int x:arr){
           if(x==1){
               count++;
           }
       }
       if(count==0){
           System.out.print("Invalid Input");
       }else{
           System.out.print(count);
       }
   }
}




















