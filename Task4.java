package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
   public static void main(String[] args) {
       Scanner var = new Scanner(System.in);
       int n = var.nextInt();
       for(int i=1;i<=n;i++){
           if(n%i==0){
               System.out.print(i + " ");
           }
       }
   }
}




















